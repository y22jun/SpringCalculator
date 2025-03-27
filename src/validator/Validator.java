package validator;

import check.CustomCharacterValidator;

import static exception.ErrorMessage.*;

public class Validator {

    private static final CustomCharacterValidator customCharacterValidator = new CustomCharacterValidator();

    public static void AllValidate(String input) {
        NotNullValidate(input);
        NotEmptyValidate(input);
        ConsecutiveSeparatorValidate(input);
        NotInputMinusValidate(input);
        NotInputDecimalPointValidate(input);
        SeparatorValidate(input);
        EndOperatorValidate(input);
        WhitespaceBeforeOperatorValidate(input);
        NotWhitespaceInputValidate(input);
    }

    private static void NotNullValidate(String input) {
        if (input == null) {
            throw new IllegalArgumentException(INPUT_NULL.getMessage());
        }
    }

    private static void NotEmptyValidate(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException(INPUT_EMPTY.getMessage());
        }
    }

    private static void ConsecutiveSeparatorValidate(String input) {
        final int OPERATOR_INDEX = input.length() - 1;
        for (int i = 0; i < OPERATOR_INDEX; i++) {
            char current = input.charAt(i);
            char next = input.charAt(i + 1);
            if (customCharacterValidator.isSeparator(current) && customCharacterValidator.isSeparator(next)) {
                throw new IllegalArgumentException(CONSECUTIVE_SEPARATOR.getMessage());
            }
        }
    }

    private static void NotInputMinusValidate(String input) {
        final int BEFORE_WHITESPACE_INDEX = input.length() - 2;
        for (int i = 0; i < BEFORE_WHITESPACE_INDEX; i++) {
            char current = input.charAt(i);
            if (customCharacterValidator.isMinus(current)) {
                throw new IllegalArgumentException(INPUT_MINUS.getMessage());
            }
        }
    }

    private static void NotInputDecimalPointValidate(String input) {
        final int BEFORE_WHITESPACE_INDEX = input.length() - 2;
        for (int i = 0; i < BEFORE_WHITESPACE_INDEX; i++) {
            char current = input.charAt(i);
            if (customCharacterValidator.isDecimalPoint(current)) {
                throw new IllegalArgumentException(INPUT_DECIMAL_POINT.getMessage());
            }
        }
    }

    private static void SeparatorValidate(String input) {
        final int BEFORE_WHITESPACE_INDEX = input.length() - 2;
        for (int i = 0; i < BEFORE_WHITESPACE_INDEX; i++) {
            char current = input.charAt(i);
            if (!Character.isDigit(current) && !customCharacterValidator.isSeparator(current) && !customCharacterValidator.isWhiteSpace(current)) {
                throw new IllegalArgumentException(INVALID_SEPARATOR.getMessage());
            }
        }
    }

    private static void EndOperatorValidate(String input) {
        final int OPERATOR_INDEX = input.length() - 1;
        char current = input.charAt(OPERATOR_INDEX);
        if (!customCharacterValidator.isOperator(current)) {
            throw new IllegalArgumentException(INVALID_OPERATE.getMessage());
        }
    }

    private static void WhitespaceBeforeOperatorValidate(String input) {
        final int BEFORE_WHITESPACE_INDEX = input.length() - 2;
        char current = input.charAt(BEFORE_WHITESPACE_INDEX);
        if (!customCharacterValidator.isWhiteSpace(current)) {
            throw new IllegalArgumentException(MISSING_WHITESPACE_BEFORE_OPERATOR.getMessage());
        }
    }

    private static void NotWhitespaceInputValidate(String input) {
        final int BEFORE_WHITESPACE_INDEX = input.length() - 2;
        for (int i = 0; i < BEFORE_WHITESPACE_INDEX; i++) {
            char current = input.charAt(i);
            if (customCharacterValidator.isWhiteSpace(current)) {
                throw new IllegalArgumentException(INPUT_WHITESPACE.getMessage());
            }
        }
    }
}
