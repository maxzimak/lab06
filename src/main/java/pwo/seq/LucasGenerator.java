package pwo.seq;

import java.math.BigDecimal;

public class LucasGenerator extends FibonacciGenerator {

    private static final BigDecimal INITIAL_VALUE = BigDecimal.valueOf(2);

    public LucasGenerator() {
        current = INITIAL_VALUE;
        f_2 = INITIAL_VALUE;
    }

    @Override
    public void reset() {
        super.reset();
        current = INITIAL_VALUE;
        f_2 = INITIAL_VALUE;
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return INITIAL_VALUE;
        } else if (lastIndex == 1) {
            lastIndex++;
            return current;
        }
        
        BigDecimal temp = f_1;
        f_1 = current.subtract(f_2);
        current = f_2;
        f_2 = temp;
        
        lastIndex--;
        return current;
    }
}
