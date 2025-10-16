package calculator;

public class Calculator {
    public static int sumCalculator(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }
}
