# java-calculator-precourse

[1주차 프리코스 미션] 문자열 덧셈 계산기

## 📋 기능 목록

### 입력 및 출력

- [x]  사용자 입력 받기
- [x]  계산 결과 출력

### 기본 기능

- [x]  기본 구분자(쉼표 (`,`) or 콜론 (`:`))로 숫자 분리
- [x]  분리된 숫자를 더해 결과 반환

### 커스텀 구분자

- [x]  커스텀 구분자 사용 처리

### 예외 처리

- [x]  커스텀 구분자의 종료를 의미하는 `\\n`이 없는 경우 → `IllegalArgumentException`
- [x]  구분자 외의 입력값(음수, 0 등) → `IllegalArgumentException`
- [x]  띄어쓰기 포함 시 (ex: "1, 2,3") → `IllegalArgumentException`
- [x]  잘못된 입력 형식(NumberFormatException 등) → `IllegalArgumentException`
- [ ]  너무 큰 수 처리 (미구현)

### 추가 처리

- [x]  빈 문자열(`""` 또는 `" "`) 입력 시 0 반환
