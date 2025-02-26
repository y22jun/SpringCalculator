package operator;

import java.util.HashMap;
import java.util.Map;

import static exception.ErrorMessage.DIVIDE_NOT_ZERO;

public enum Operator {

    PLUS('+') {
        public double result(double a, double b) {
            return a + b;
        }
    },
    MINUS('-') {
        public double result(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY ('*'){
        public double result(double a, double b) {
            return a * b;
        }
    },
    DIVIDE('/') {
        public double result(double a, double b) {
            if (b == 0) {
                throw new IllegalArgumentException(DIVIDE_NOT_ZERO.getMessage());
            }
            return a / b;
        }
    };

    public abstract double result(double a, double b);

    private final char saveOperator;
    private static final Map<Character, Operator> operators = new HashMap<>();

    Operator(char saveOperator) {
        this.saveOperator = saveOperator;
    }

    static {
        for (Operator operator : values()) {
            operators.put(operator.saveOperator, operator);
        }
    }

    public static Operator fromOperator(char operator) {
        return operators.get(operator);
    }
}
