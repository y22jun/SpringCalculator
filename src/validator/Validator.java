package validator;

import check.CustomCharacterValidator;

import static exception.ErrorMessage.*;

public class Validator {

    private final CustomCharacterValidator customCharacterValidator = new CustomCharacterValidator();

    public void AllValidate(String input) {
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

    private void NotNullValidate(String input) {
        if(input == null) {
            throw new IllegalArgumentException(INPUT_NULL.getMessage());
        }
    }

    private void NotEmptyValidate(String input) {
        if(input.isEmpty()) {
            throw new IllegalArgumentException(INPUT_EMPTY.getMessage());
        }
    }

    private void ConsecutiveSeparatorValidate(String input) {
        for(int i = 0; i < input.length() - 1; i++) {
            char current = input.charAt(i);
            char next = input.charAt(i + 1);
            if(customCharacterValidator.isSeparator(current) && customCharacterValidator.isSeparator(next)) {
                throw new IllegalArgumentException(CONSECUTIVE_SEPARATOR.getMessage());
            }
        }
    }

    private void NotInputMinusValidate(String input) {
        for(int i = 0; i < input.length() - 2; i++) {
            char current = input.charAt(i);
            if(customCharacterValidator.isMinus(current)) {
                throw new IllegalArgumentException(INPUT_MINUS.getMessage());
            }
        }
    }

    private void NotInputDecimalPointValidate(String input) {
        for(int i = 0; i < input.length() - 2; i++) {
            char current = input.charAt(i);
            if(customCharacterValidator.isDecimalPoint(current)) {
                throw new IllegalArgumentException(INPUT_DECIMAL_POINT.getMessage());
            }
        }
    }

    private void SeparatorValidate(String input) {
        for(int i = 0; i < input.length() - 2; i++) {
            char current = input.charAt(i);
            if(!Character.isDigit(current) && !customCharacterValidator.isSeparator(current) && !customCharacterValidator.isWhiteSpace(current)) {
                throw new IllegalArgumentException(INVALID_SEPARATOR.getMessage());
            }
        }
    }

    private void EndOperatorValidate(String input) {
        char current = input.charAt(input.length() - 1);
        if(!customCharacterValidator.isOperator(current)) {
            throw new IllegalArgumentException(INVALID_OPERATE.getMessage());
        }
    }

    private void WhitespaceBeforeOperatorValidate(String input) {
        char current = input.charAt(input.length() - 2);
        if(!customCharacterValidator.isWhiteSpace(current)) {
            throw new IllegalArgumentException(MISSING_WHITESPACE_BEFORE_OPERATOR.getMessage());
        }
    }

    private void NotWhitespaceInputValidate(String input) {
        for(int i = 0; i < input.length() - 2; i++) {
            char current = input.charAt(i);
            if(customCharacterValidator.isWhiteSpace(current)) {
                throw new IllegalArgumentException(INPUT_WHITESPACE.getMessage());
            }
        }
    }
}
