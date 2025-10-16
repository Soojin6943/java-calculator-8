package calculator;

public class Parser {
    private Parser() {

    }

    public static int[] splitInput(String input) {
        // 기본 구분자
        StringBuilder separators = new StringBuilder(",|:");

        // 빈 문자열 or 공백 처리
        if (input.isBlank()){
            return new int[]{0};
        }

        // 커스텀 구분자 판단
        // 문제에서 사이에 위치하는 "문자"라고 했으므로 문자 하나만 들어온다고 가정
        if (input.startsWith("//")) {
            if (input.substring(3, 5).equals("\\n")) {
                separators.append("|").append(input.charAt(2));
                input = input.substring(5, input.length());
            } else {
                throw new IllegalArgumentException("커스텀 문자의 종료 지점('\\n')이 없습니다.");
            }
        }

        String[] strNumbers = input.split(separators.toString());
        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        return numbers;
    }
}
