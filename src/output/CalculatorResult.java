package output;

import java.util.List;

public record CalculatorResult(List<Double> numbers, char operator, double result) {

    public String expressionResult() {
        final int NUMBER_SIZE = numbers().size();
        final double FIRST_INDEX = numbers().get(0);
        StringBuilder expressionResult = new StringBuilder();
        expressionResult.append(FIRST_INDEX);
        for(int i = 1; i < NUMBER_SIZE; i++) {
            expressionResult.append(" ").append(operator()).append(" ").append(numbers().get(i)); //분리를 해서 더 단순하게 만들자
        }

        return expressionResult.toString();
    }

    public String inputResult() {
        return String.format("%.1f", result);
    }
}
