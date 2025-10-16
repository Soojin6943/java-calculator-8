package calculator;

import camp.nextstep.edu.missionutils.Console;

import static calculator.Calculator.sumCalculator;
import static calculator.Parser.splitInput;

public class Application {
    public static void main(String[] args) {
        // 사용자 입력 받기
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        // 문자열 나누기 (문자열 -> 문자 배열 -> 숫자 배열)
        int[] numbers = splitInput(input);
        // 각 숫자 더하기
        int result = sumCalculator(numbers);

        // 결과 출력
        System.out.println("결과 : " + result);
    }
}
