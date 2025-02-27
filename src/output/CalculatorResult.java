package output;

import java.util.List;

public record CalculatorResult(List<Double> numbers, char operator, double result) {

    public String expressionResult() {
        StringBuilder expressionResult = new StringBuilder();
        expressionResult.append(numbers().get(0)); //numbers().get(0) 수정
        for(int i = 1; i < numbers().size(); i++) {
            expressionResult.append(" ").append(operator()).append(" ").append(numbers().get(i)); //분리를 해서 더 단순하게 만들자
        }

        return expressionResult.toString();
    }

    public String inputResult() {
        return String.format("%.1f", result);
    }
}
