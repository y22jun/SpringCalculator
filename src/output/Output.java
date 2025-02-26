package output;

import calculator.Calculator;

public class Output {

    private final Calculator calculator = new Calculator();

    public void startCalculator(String userInput) {
        CalculatorResult calculatorResult = calculator.calculate(userInput);
        printResult(calculatorResult);
    }

    private void printResult(CalculatorResult calculatorResult) {
        System.out.println(calculatorResult.expressionResult() + " = " + calculatorResult.inputResult());
    }
}
