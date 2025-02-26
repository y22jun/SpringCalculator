package check;

public abstract class CharacterValidator {
    public abstract boolean isSeparator(char current);

    public abstract boolean isWhiteSpace(char current);

    public abstract boolean isOperator(char current);

    public abstract boolean isMinus(char current);

    public abstract boolean isDecimalPoint(char current);
}
