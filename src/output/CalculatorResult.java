package output;

import java.util.List;

public record CalculatorResult(List<Double> numbers, char operator, double result) {

}
