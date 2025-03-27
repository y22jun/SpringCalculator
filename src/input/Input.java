package input;

import validator.Validator;

import java.util.Scanner;

public class Input {

    private static Scanner SCANNER;

    private Input() {}

    private static Scanner getInstance() {
        if (SCANNER == null) {
            SCANNER = new Scanner(System.in);
        }
        return SCANNER;
    }

    public static String nextLine() {
        String input = getInstance().nextLine();

        Validator.AllValidate(input);

        return input;
    }

    public static void close() {
        if (SCANNER != null) {
            SCANNER.close();
            SCANNER = null;
        }
    }
}
