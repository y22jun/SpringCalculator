package input;

import validator.Validator;

import java.util.Scanner;

public class Input {

    private static Scanner SCANNER;

    private Input() {}
    private final Validator validator = new Validator();

    private static Scanner getInstance() {
        if (SCANNER == null) {
            SCANNER = new Scanner(System.in);
        }
        return SCANNER;
    }

    public static String nextLine() {
        return getInstance().nextLine();
    }

    public static void close() {
        if (SCANNER != null) {
            SCANNER.close();
            SCANNER = null;
        }
    }
}
