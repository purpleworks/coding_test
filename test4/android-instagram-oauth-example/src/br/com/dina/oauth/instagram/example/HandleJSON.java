package br.com.dina.oauth.instagram.example;

import android.annotation.SuppressLint;
import android.util.Log;
import android.widget.Toast;
import android.widget.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HandleJSON
{
    public String urlString;
    public JSONArray jsonMainNode;
    public String image;
    public String next;
    public String prev;
    public String a;

    public volatile boolean parsingComplete = true;

    public HandleJSON(String url){
        this.urlString = url;
    }

    @SuppressLint("NewApi")
    public void readAndParseJSON(String in) {
        try {
            JSONObject reader = new JSONObject(in);     // java에 있는 jsonobject를 선언하여 옮김
            JSONObject temp = reader.optJSONObject("pagination");
            next = temp.getString("next_min_id");
            Log.d("next_min_id", next);
            prev = temp.getString("next_max_id");
            Log.d("next_max_id", prev);
            //jsonMainNode = new JSONArray();
            jsonMainNode = reader.optJSONArray("data");  // data -> 0번째에 -> image -> url
            JSONObject t1;// = new JSONObject();

            t1 = jsonMainNode.getJSONObject(0);
            JSONObject t2;// = new JSONObject();
            t2 = t1.getJSONObject("images");
            JSONObject t3 = t2.getJSONObject("standard_resolution");
            image = t3.getString("url");
            Log.d("image url", image);

            // contnet는 array형식으로 되있으므로 json array로 선언해둠(위에)

        } catch (Exception e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public void geturl(int count){
        try{
            JSONObject sys = jsonMainNode.getJSONObject(count);     // content내에 있는 array[n]번째를 json object로 옮겨담음
            JSONObject temp = sys.getJSONObject("images");
            image = sys.getString("url");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void fetchJSON(){
        //Thread thread = new Thread(new Runnable(){
        //  @Override
//            public void run() {
        try {
            URL url = new URL(urlString);
            Log.d("URL : ", urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();  // json있는 장소로 connect
            conn.setReadTimeout(10000 /* milliseconds */);
            conn.setConnectTimeout(15000 /* milliseconds */);
            conn.setRequestMethod("GET");   // method 이용하여 data 받을 준비
            conn.setDoInput(true);
            // Starts the query
            conn.connect();

            InputStream stream = conn.getInputStream(); // data 전달받음
            String data = convertStreamToString(stream);    // java에서 사용할 수 있도록 우선 string으로 convert

            readAndParseJSON(data); // string으로 받은 data를 json으로 parsing 할수 있도록 준비
            // 위에 function declare

            stream.close();
            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
            Log.d("error", "input error");
        }
//            }
        //      });

//        thread.start();
    }
    static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}