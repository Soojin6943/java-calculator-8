package calculator;

import static calculator.Calculator.sumCalculator;
import static calculator.InputView.readInput;
import static calculator.OutputView.printResult;
import static calculator.Parser.splitInput;

public class Application {
    public static void main(String[] args) {
        // 사용자 입력 받기
        String input = readInput();

        // 문자열 나누기 (문자열 -> 문자 배열 -> 숫자 배열)
        int[] numbers = splitInput(input);
        // 각 숫자 더하기
        int result = sumCalculator(numbers);

        // 결과 출력
        printResult(result);
    }
}
