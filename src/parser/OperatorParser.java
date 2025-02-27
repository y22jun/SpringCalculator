package parser;

public class OperatorParser {

    public char parserOperator(String input) {
        final int OPERATOR_INDEX = input.length() - 1;
        return input.charAt(OPERATOR_INDEX);
    }
}
