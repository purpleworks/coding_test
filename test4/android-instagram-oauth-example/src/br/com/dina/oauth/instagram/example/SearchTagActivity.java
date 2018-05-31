package br.com.dina.oauth.instagram.example;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by KSG_C on 2015-03-05.
 */
public class SearchTagActivity extends Activity {

    private String token;
    private HandleJSON obj;
    private String url;
    private EditText input;
    private String next;
    private String prev;
    private int pagecount;
    String url_store[] = new String[21];
    //private static final String TAG = "url : ";
    ImageView imgView[]=new ImageView[21];
    Bitmap bit=null;
    String temp_url;
    //int k;//img를 버튼으로 만들기위한 for문의 k(에러생겨서 여기에 선언)

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tag);
        input = (EditText)findViewById(R.id.input);
        imgView[0]=(ImageView)findViewById(R.id.img1);
        imgView[1]=(ImageView)findViewById(R.id.img2);
        imgView[2]=(ImageView)findViewById(R.id.img3);
        imgView[3]=(ImageView)findViewById(R.id.img4);
        imgView[4]=(ImageView)findViewById(R.id.img5);
        imgView[5]=(ImageView)findViewById(R.id.img6);
        imgView[6]=(ImageView)findViewById(R.id.img7);
        imgView[7]=(ImageView)findViewById(R.id.img8);
        imgView[8]=(ImageView)findViewById(R.id.img9);
        imgView[9]=(ImageView)findViewById(R.id.img10);
        imgView[10]=(ImageView)findViewById(R.id.img11);
        imgView[11]=(ImageView)findViewById(R.id.img12);
        imgView[12]=(ImageView)findViewById(R.id.img13);
        imgView[13]=(ImageView)findViewById(R.id.img14);
        imgView[14]=(ImageView)findViewById(R.id.img15);
        imgView[15]=(ImageView)findViewById(R.id.img16);
        imgView[16]=(ImageView)findViewById(R.id.img17);
        imgView[17]=(ImageView)findViewById(R.id.img18);
        imgView[18]=(ImageView)findViewById(R.id.img19);
        imgView[19]=(ImageView)findViewById(R.id.img20);
        imgView[20]=(ImageView)findViewById(R.id.img21);
        token = getIntent().getStringExtra("token");


        /*for(k=0;k<21;k++) {
            imgView[k].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
                    //myIntent.putExtra("url", url_store[k]);
                    //startActivity(myIntent);
                }
            });
        }*/

    }

    public void BtnImg1(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[0]);
        startActivity(myIntent);
    }
    public void BtnImg2(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[1]);
        startActivity(myIntent);
    }
    public void BtnImg3(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[2]);
        startActivity(myIntent);
    }
    public void BtnImg4(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[3]);
        startActivity(myIntent);
    }
    public void BtnImg5(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[4]);
        startActivity(myIntent);
    }
    public void BtnImg6(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[5]);
        startActivity(myIntent);
    }
    public void BtnImg7(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[6]);
        startActivity(myIntent);
    }
    public void BtnImg8(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[7]);
        startActivity(myIntent);
    }
    public void BtnImg9(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[8]);
        startActivity(myIntent);
    }
    public void BtnImg10(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[9]);
        startActivity(myIntent);
    }
    public void BtnImg11(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[10]);
        startActivity(myIntent);
    }
    public void BtnImg12(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[11]);
        startActivity(myIntent);
    }
    public void BtnImg13(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[12]);
        startActivity(myIntent);
    }
    public void BtnImg14(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[13]);
        startActivity(myIntent);
    }
    public void BtnImg15(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[14]);
        startActivity(myIntent);
    }
    public void BtnImg16(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[15]);
        startActivity(myIntent);
    }
    public void BtnImg17(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[16]);
        startActivity(myIntent);
    }
    public void BtnImg18(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[17]);
        startActivity(myIntent);
    }
    public void BtnImg19(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[18]);
        startActivity(myIntent);
    }
    public void BtnImg20(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[19]);
        startActivity(myIntent);
    }
    public void BtnImg21(View v){
        Intent myIntent = new Intent(getApplicationContext(), SelectImgActivity.class);
        myIntent.putExtra("url", url_store[20]);
        startActivity(myIntent);
    }

    public void BtnSearch(View v){
        //"https://api.instagram.com/v1/tags/puppy/media/recent?access_token=fb2e77d.47a0479900504cb3ab4a1f626d174d2d&max_id=13872296"
        url = "https://api.instagram.com/v1/tags/"+ input.getText().toString() + "/media/recent?access_token=" + token;
        pagecount = 0;
        //Toast.makeText(getApplicationContext(), url, Toast.LENGTH_LONG).show();
        //Log.d(TAG, "Redirecting URL " + url);
        con();
        WebGetImage();
        //SystemClock.sleep(1000);
        imgView[0].setImageBitmap(bit);

        for(int i=1; i<21; i++) {
            String temp = url+ "&max_id=" + prev+ "&count=1";
            Log.d("next url", temp);
            HandleJSON tobj = new HandleJSON(temp);
            tobj.fetchJSON();
            url_store[i] = tobj.image;
            next = tobj.next;
            prev = tobj.prev;

            temp_url=url_store[i];
            WebGetImage();
            //SystemClock.sleep(5000);
            imgView[i].setImageBitmap(bit);
            //Log.d(search_url, "url_store: " + url_store[i]);
        }
    }

    public void nextSearch(View v) {
        //search_url = url + "&max_id=" + obj.next;
       // SystemClock.sleep(1000);
        pagecount++;
        for(int i=0; i<21; i++) {
            String temp = url+ "&max_id=" + prev+ "&count=1";
            Log.d("next url", temp);
            HandleJSON tobj = new HandleJSON(temp);
            tobj.fetchJSON();
            url_store[i] = tobj.image;
            next = tobj.next;
            prev = tobj.prev;

            temp_url=url_store[i];
            WebGetImage();
            //SystemClock.sleep(5000);
            imgView[i].setImageBitmap(bit);
            //Log.d(search_url, "url_store: " + url_store[i]);
        }
    }
    public void prevSearch(View v) {
        //search_url = url+ "&min_id=" + obj.prev;
        //SystemClock.sleep(1000);
        if(pagecount > 0) {
            for (int i = 0; i < 21; i++) {
                String temp = url + "&min_id=" + next + "&count=1";
                Log.d("next url", temp);
                HandleJSON tobj = new HandleJSON(temp);
                tobj.fetchJSON();
                url_store[i] = tobj.image;
                next = tobj.next;
                prev = tobj.prev;

                temp_url = url_store[20 - i];
                WebGetImage();
                //SystemClock.sleep(5000);
                imgView[20 - i].setImageBitmap(bit);
                //Log.d(search_url, "url_store: " + url_store[i]);
            }
        }
        else {
            Toast.makeText(getApplicationContext(), "첫페이지입니다.", Toast.LENGTH_LONG).show();
        }
    }

    public void con() {
        String temp = url + "&count=1";
        Log.d("first url",url);
        obj = new HandleJSON(temp);
        obj.fetchJSON();
        url_store[0] = obj.image;
        next = obj.next;
        prev = obj.prev;
        temp_url = obj.image;
    }

    public void WebGetImage(){
        try {
            URL Url = new URL(temp_url);
            //Log.d(search_url, "temp: " + temp_url);
            URLConnection urlcon = Url.openConnection();
            urlcon.connect();
            int imagelength = urlcon.getContentLength();
            BufferedInputStream bis = new BufferedInputStream(urlcon.getInputStream(), imagelength);
            bit = BitmapFactory.decodeStream(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}