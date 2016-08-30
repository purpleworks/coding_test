# Backend 지원 테스트 1

Backend 분야에 지원하는 분을 위한 테스트문제입니다.

하단의 요구사항을 해결하기 위해 Database Table Schema를 간략하게 설계해 주세요. 확장성과 API를 고려하여 작성해 주시면 됩니다.

지원자는 면접전까지 결과를 메일로 회신해주세요.

## 요구사항

일반적인(https://www.airbnb.com/s/seoul) 숙박 예약 시스템을 만드려고 합니다.
현재 방정보는 만들어져 있으며 금액과 관련된 내용을 개발해야 합니다.

- 기본 금액 정책
  - 주중금액
    - 일-목
  - 주말금액
    - 금-토
  - 준성수기금액
    - 기간
    - 방마다 기간이 다름
  - 성수기금액
    - 기간
    - 방마다 기간이 다름
  - 특별가
    - 특정 날짜별로 커스터마이징
- 옵션 금액 정책
  - 추가인원에 따른 추가금액
- API
  - 조건에 맞는 방리스트 검색
    - 체크인 날짜
    - 체크아웃 날짜
    - 최소금액
    - 최대금액
    - 게스트 수
- 그외 확장성
  - 지금 설계 하지는 않지만 확장성 고려
  - VIP 회원 우대 기능
  - 특정 방 전체 일정 일괄 할인 기능
  - 그외 예약시스템을 고려한 확장

## 결과 샘플

### Table Schema

테이블명, 컬럼명, 컬럼타입을 입력합니다.

#### users
- email / string
- encrypted_password / string
- name / string
- phone / string
- created_at / datetime
- updated_at / datetime

## 문의사항

`chungsub.kim@purpleworks.co.kr`로 메일 주세요.

감사합니다 :)
