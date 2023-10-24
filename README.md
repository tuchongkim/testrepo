# 프리코스 1주차 미션 - 숫자 야구
![Static Badge](https://img.shields.io/badge/precourse-week1-<color>)
![Static Badge](https://img.shields.io/badge/version-1.0-informational)

> 우아한테크코스 6기 1주차 미션 진행을 위한 저장소입니다.

## 🚀 기능 목록

### 게임 시작
- 게임 시작 문구 출력

### 상대방(컴퓨터)의 3자리 수 생성
- 랜덤하게 1부터 9까지의 서로 다른 3개의 숫자로 이루어진 3자리 수 생성

### 사용자의 입력 처리
- 정상적으로 서로 다른 3자리의 수를 입력한 경우
  + 사용자의 3자리 수 생성
- 게임 재시작(1) 또는 종료(2)를 위한 숫자를 입력하는 경우
  + 재시작 처리
  + 게임 완전 종료
- 잘못된 값을 입력하는 경우
  + IllegalArgumentException 발생, 애플리케이션 종료

### 사용자의 3자리 수 생성
- 입력값을 바탕으로 3자리수 생성

### 결과 계산
- 같은 수가 같은 자리에 있으면 '스트라이크'
- 같은 수가 다른 자리에 있으면 '볼'
- 같은 수가 전혀 없으면 '낫싱'

### 결과 출력
- 정담을 못 맞춘 경우
  + 힌트 출력
- 정답을 맞춘 경우
  + 게임 종료 문구 출력
  + 재시작 여부 확인 문구 출력

### 재시작 처리
