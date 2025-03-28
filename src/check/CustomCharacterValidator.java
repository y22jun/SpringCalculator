package check;

public class CustomCharacterValidator extends CharacterValidator {

    //열거형으로
    private static final char COLON = ':';
    private static final char COMMA = ',';
    private static final char SPACE = ' ';
    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLY = '*';
    private static final char DIVIDE = '/';
    private static final char DECIMAL_POINT = '.';

    public boolean isSeparator(char current) {
        return current == COLON || current == COMMA;
    }

    public boolean isWhiteSpace(char current) {
        return current == SPACE;
    }

    public boolean isOperator(char current) {
        return current == PLUS || current == MINUS || current == MULTIPLY || current == DIVIDE;
    }

    public boolean isMinus(char current) {
        return current == MINUS;
    }

    public boolean isDecimalPoint(char current) {
        return current == DECIMAL_POINT;
    }
}
