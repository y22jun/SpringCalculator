package input;

import validator.Validator;

import java.util.Scanner;

public class Input {

    private String input;
    private final Scanner scanner = new Scanner(System.in);
    private final Validator validator = new Validator();

    private void readInput() {
        input = scanner.nextLine();
    }

    private void validateInput() {
        validator.AllValidate(input);
    }

    public void processInput() {
        readInput();
        validateInput();
    }

    public String getInput() {
        return input;
    }
}
