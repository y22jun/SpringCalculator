package operator;

import java.util.HashMap;
import java.util.Map;

public class AllOperator {

    private final Map<Character, Operator> operators = new HashMap<>();

    public AllOperator() {
        operators.put('+', new AddOperator());
        operators.put('-', new SubtractionOperator());
        operators.put('*', new MultiplyOperator());
        operators.put('/', new DivideOperator());
    }

    public Operator getOperator(char operator) {
        return operators.get(operator);
    }
}
