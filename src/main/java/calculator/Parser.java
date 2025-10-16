package calculator;

public class Parser {

    public static int[] splitInput(String input) {
        String[] strNumbers = input.split(",|;");

        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++){
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        return numbers;
    }
}
