package operator;

import static exception.ErrorMessage.DIVIDE_NOT_ZERO;

public enum Operator {

    PLUS {
        public double result(double a, double b) {
            return a + b;
        }
    },
    MINUS {
        public double result(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY {
        public double result(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        public double result(double a, double b) {
            if(b == 0) {
                throw new IllegalArgumentException(DIVIDE_NOT_ZERO.getMessage());
            }
            return a / b;
        }
    };
    public abstract double result(double a, double b);
}
