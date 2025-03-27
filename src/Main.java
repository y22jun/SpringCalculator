import input.Input;
import output.Output;

public class Main {
    public static void main(String[] args) {
        String userInput = Input.nextLine();
        Output output = new Output();
        output.startCalculator(userInput);
        Input.close();
    }
}