# Backend Rails 지원 테스트 1

Backend 분야에 지원하는 분을 위한 Rails 테스트문제입니다.

현재 폴더에 작성된 샘플 프로젝트를 다운받고 기본적인 Rails 프로젝트 환경을 구성합니다. 하단의 요구사항을 확인 한 후 코드를 작성하면 됩니다.

지원자는 소스를 작성 후 프로젝트 폴더를 압축하여 메일로 회신해주세요.

## 프로젝트 소개

간단한 호텔 프로젝트입니다.

`Booking` 모델만 존재하며 다음과 같은 스키마로 구성되어 있습니다.

- name: 예약명
- start_time: 예약 시작일시(체크인)
- end_time: 예약 종료일시(체크아웃)
- status: 예약 상태
  - ready: 예약 신청
  - accepted: 예약 확정
  - canceled: 예약 취소

[rspec](http://rspec.info/)과 [factory_girl](https://github.com/thoughtbot/factory_girl)을 사용합니다.

## 요구사항

[필수]항목은 반드시 완료해야 하며, [옵션]항목은 시간이 있을 경우만 작성하면 됩니다.

1. 유효성검증 코드 작성 [필수]

  [booking_spec.rb](spec/models/booking_spec.rb)에서 3가지 유효성검증 테스트틀 모두 통과하도록 [booking.rb](app/models/booking.rb) 파일에 코드를 작성합니다.

2. 예약날짜검증 코드 작성 [필수]

  [booking_spec.rb](spec/models/booking_spec.rb)에 한가지 테스트가 샘플로 작성되어 있습니다. 추가적인 테스트 케이스를 작성하고 그에 따라 [booking.rb](app/models/booking.rb)파일에 코드를 작성합니다.

3. status와 관련된 코드 추가 [옵션]

  status(예약 상태)와 관련된 scope 코드를 작성합니다. canceled(예약 취소) 상황에 따른 테스트 코드를 작성합니다.

## 테스트

콘솔에서 `bundle exec rspec spec` 명령어를 입력합니다.

```
Booking
  유효성검증
    name은 필수항목이다 (FAILED - 1)
    start_time은 필수항목이다 (FAILED - 2)
    end_time은 필수항목이다 (FAILED - 3)
  예약날짜검증
    동일한 시간에 예약이 있으면 예약이 불가능하다 (FAILED - 4)
...
```

## 문의사항

`chungsub.kim@purpleworks.co.kr`로 메일 주세요.

감사합니다 :)
