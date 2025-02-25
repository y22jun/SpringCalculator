package check;

public class CustomCharacterValidator extends CharacterValidator {

    private static final char COLON = ':';
    private static final char COMMA = ',';
    private static final char SPACE = ' ';
    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLY = '*';
    private static final char DIVIDE = '/';

    @Override
    public boolean isSeparator(char current) {
        return current == COLON || current == COMMA;
    }

    @Override
    public boolean isWhiteSpace(char current) {
        return current == SPACE;
    }

    @Override
    public boolean isOperator(char current) {
        return current == PLUS || current == MINUS || current == MULTIPLY || current == DIVIDE;
    }
}
