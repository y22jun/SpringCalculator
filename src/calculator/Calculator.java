package calculator;

import operator.AllOperator;
import operator.Operator;
import output.CalculatorResult;
import parser.OperatorParser;
import parser.SeparatorParser;

import java.util.List;

public class Calculator {

    private final SeparatorParser separatorParser = new SeparatorParser();
    private final OperatorParser operatorParser = new OperatorParser();
    private final AllOperator allOperator = new AllOperator();

    public CalculatorResult calculate(String input) {
        char operator = operatorParser.parserOperator(input);
        List<Double> numbers = separatorParser.parserSeparator(input);
        double result = numbers.get(0);

        Operator checkOperator = allOperator.getOperator(operator);

        for(int i = 1; i < numbers.size(); i++) {
            double currentNumber = numbers.get(i);
            result = checkOperator.result(result, currentNumber);
        }

        return new CalculatorResult(numbers, operator, result);
    }
}
