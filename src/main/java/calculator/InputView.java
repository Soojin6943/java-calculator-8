package calculator;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String readInput() {
        // 사용자 입력 받기
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        return input;
    }
}
