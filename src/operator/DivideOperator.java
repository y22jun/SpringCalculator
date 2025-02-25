package operator;

import static exception.ErrorMessage.DIVIDE_NOT_ZERO;

public class DivideOperator implements Operator {

    @Override
    public double result(double a, double b) {
        if(b == 0) {
            throw new IllegalArgumentException(DIVIDE_NOT_ZERO.getMessage());
        }
        return a / b;
    }
}
