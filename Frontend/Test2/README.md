# Frontend 지원 테스트 2

Frontend 분야에 지원하는 분을 위한 테스트문제입니다.

하단의 요구사항을 읽고 실제로 동작하는 React 코드를 작성해주세요.

`yarn dev`명령어를 통해 결과를 브라우져(http://localhost:3000)에서 확인할 수 있어야 합니다.

- [준비사항](#준비사항)
- [요구사항](#요구사항)
- [결과샘플](#결과샘플)
- [문의사항](#문의사항)

## 준비사항

- [Node.js](https://nodejs.org/ko/) 8 이상
- [Next.js](https://github.com/zeit/next.js/)
- [json-server](https://github.com/typicode/json-server)

## 요구사항

**API Server**

- json-server를 사용하고 같은 폴더에 첨부된 `db.js`를 이용합니다.
- 개발 피시에서 `json-server`를 실행하고 사용합니다. (9000 port)
  - `$ json-server -p 9000 db.json`
- API 명세는 다음과 같습니다.
  - 리스트 - GET /stores
  - 상세 - GET /stores/:id

**Library & Framework**

- Next.js는 React를 기반으로 한 정적-서버 사이드 렌더링 프레임워크 입니다. github의 [README.md](https://github.com/zeit/next.js/)를 보고 사용법을 익힌 후 하단의 요구사항을 구현합니다.
- CSS 프레임워크를 한가지 골라서 적용합니다. [Material-UI](https://github.com/callemall/material-ui), [Ant-design](https://github.com/ant-design/ant-design), [React-Bootstrap](https://github.com/react-bootstrap/react-bootstrap)등 어떤 것도 괜찮습니다. 

**화면**

맛집 리스트를 보여주고 리스트 중 하나의 아이템을 선택하면 팝업으로 상세 설명을 보여줍니다.

- 헤더 - 바디 - 푸터 형식으로 표현
- 헤더에는 프로젝트이름(`AWESOME FOOD STORE`)과 메뉴(`ABOUT` + `STORE`) 표현
- 푸터에는 카피라이트 추가(`@ 2018 purpleworks`)
- ABOUT엔 간단한 프로젝트 소개 문구 표현 (정적 페이지)
- STORE 리스트는 정사각형 이미지 그리드로 표현 (REST API 사용)
- 하나의 아이템을 선택하면 팝업을 띄우고 맛집 이름과 사진, 설명, 홈페이지 바로가기(url이 있을 경우)를 표현
- 팝업 오른쪽 위에 X버튼을 넣고 누르면 팝업이 닫힘
- 정의하지 않은 url로 접근시 에러 페이지를 보여주고 5초 후 메인 페이지로 이동

## 결과샘플

[커먼그라운드 eat](https://www.common-ground.co.kr/eat) 화면을 참고하세요.

## 문의사항

`chungsub.kim@purpleworks.co.kr`로 메일 주세요.

감사합니다 :)
