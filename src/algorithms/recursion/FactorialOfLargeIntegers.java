package algorithms.recursion;

import java.math.BigInteger;

public class FactorialOfLargeIntegers {
    private static BigInteger calculateFactorial(BigInteger number) {
        if (number.equals(BigInteger.ONE) || number.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        return number.multiply(calculateFactorial(number.subtract(BigInteger.ONE)));
    }
}
