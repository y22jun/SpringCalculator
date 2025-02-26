package output;

import java.util.List;

public record CalculatorResult(List<Double> numbers, char operator, double result) {

    public String expressionResult() {
        StringBuilder expressionResult = new StringBuilder();
        expressionResult.append(numbers().get(0));
        for(int i = 1; i < numbers().size(); i++) {
            expressionResult.append(" ").append(operator()).append(" ").append(numbers().get(i));
        }

        return expressionResult.toString();
    }

    public String inputResult() {
        return String.format("%.1f", result);
    }
}
