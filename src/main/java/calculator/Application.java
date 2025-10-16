package calculator;

import camp.nextstep.edu.missionutils.Console;

import static calculator.Parser.splitInput;

public class Application {
    public static void main(String[] args) {
        // 사용자 입력 받기
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        // 문자열 나누기
        int[] numbers = splitInput(input);

        // 임시 출력 확인용
        for (int num : numbers){
            System.out.println(num);
        }
    }
}
