import input.Input;
import output.Output;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.processInput();
        String userInput = input.getInput();
        Output output = new Output();
        output.startCalculator(userInput);
    }
}