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

> 문자열 앞부분의 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용 <br>
-> 커스텀 구분자는 무조건 "//"로 시작 <br>
-> "문자"라고 했으므로 문자 여러개는 예외 처리 <br>
-> "\n"이 없으면 예외 처리 <br>

> 구분자와 양수로 구성된 문자열 <br>
-> "양수"이므로 구분자를 제외한 음수, 0, 띄어쓰기 등 전부 예외처리

### 추가 처리

- [x]  빈 문자열(`""` 또는 `" "`) 입력 시 0 반환

## 🥽 실행 예시

커스텀 구분자 사용

```bash
덧셈할 문자열을 입력해 주세요.
 //;\n1,2,3;4
결과 : 10
```

음수 입력 시
```bash
덧셈할 문자열을 입력해 주세요.
 -1,2,3
Exception in thread "main" java.lang.IllegalArgumentException: 잘못된 형식의 입력값입니다
```

다중 커스텀 문자 입력 시
```bash
덧셈할 문자열을 입력해 주세요.
 //;;\n1,2,3;4
Exception in thread "main" java.lang.IllegalArgumentException: 커스텀 문자의 형식이 잘못되었습니다.
```

종료를 의미하는 \n 누락
```bash
덧셈할 문자열을 입력해 주세요.
 //;1,2,3
Exception in thread "main" java.lang.IllegalArgumentException: 커스텀 문자의 형식이 잘못되었습니다.
```

음수 처리
```bash
덧셈할 문자열을 입력해 주세요.
 -1,2,3:4
Exception in thread "main" java.lang.IllegalArgumentException: 잘못된 형식의 입력값입니다
```

0 입력
```bash
덧셈할 문자열을 입력해 주세요.
 //;\n1,2,0;4
Exception in thread "main" java.lang.IllegalArgumentException: 잘못된 형식의 입력값입니다
```

띄어쓰기 입력
```bash
덧셈할 문자열을 입력해 주세요.
 1, 2,3,4
Exception in thread "main" java.lang.IllegalArgumentException: 띄어쓰기는 잘못된 형식입니다.
```

잘못된 형식의 입력 1
```bash
덧셈할 문자열을 입력해 주세요.
 /;\n1,3,4;5
Exception in thread "main" java.lang.IllegalArgumentException: 잘못된 형식의 입력값입니다.
```

잘못된 형식의 입력 2
```bash
덧셈할 문자열을 입력해 주세요.
 1,2,3//;\n
Exception in thread "main" java.lang.IllegalArgumentException: 잘못된 형식의 입력값입니다.
```

잘못된 형식의 입력 3
```bash
덧셈할 문자열을 입력해 주세요.
 1,2,3,//;\n
Exception in thread "main" java.lang.IllegalArgumentException: 잘못된 형식의 입력값입니다.
```
