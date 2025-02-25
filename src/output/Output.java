package output;

import calculator.Calculator;

public class Output {

    private final Calculator calculator = new Calculator();

    public void startCalculator(String userInput) {
        CalculatorResult calculatorResult = calculator.calculate(userInput);
        printResult(calculatorResult);
    }

    private void printResult(CalculatorResult calculatorResult) {
        StringBuilder finalPrint = new StringBuilder();
        finalPrint.append(calculatorResult.numbers().get(0));

        for(int i = 1; i < calculatorResult.numbers().size(); i++) {
            finalPrint.append(" ").append(calculatorResult.operator()).append(" ").append(calculatorResult.numbers().get(i));
        }

        System.out.println(finalPrint + " = " + String.format("%.1f", calculatorResult.result()));
    }
}
