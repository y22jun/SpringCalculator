package parser;

import check.CustomCharacterValidator;

import java.util.ArrayList;
import java.util.List;

public class SeparatorParser {

    private final CustomCharacterValidator customCharacterValidator = new CustomCharacterValidator();

    public List<Double> parserSeparator(String input) {
        List<Double> result = new ArrayList<>();
        StringBuilder number = new StringBuilder();
        final int BEFORE_WHITESPACE_INDEX = input.length() - 2;

        for(int i = 0; i < BEFORE_WHITESPACE_INDEX; i++) {
            appendNumber(input.charAt(i), number, result);
        }

        addNumberToList(number, result);
        return result;
    }

    private void appendNumber(char current, StringBuilder number, List<Double> result) {
        if(!customCharacterValidator.isSeparator(current)) {
            number.append(current);
            return;
        }
        addNumberToList(number, result);
    }

    private void addNumberToList(StringBuilder number, List<Double> result) {
        if(number.isEmpty()) {
            return;
        }

        result.add(Double.parseDouble(number.toString().trim()));
        number.setLength(0);
    }
}
