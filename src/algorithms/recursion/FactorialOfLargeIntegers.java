package algorithms.recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfLargeIntegers {
    private static BigInteger calculateFactorial(BigInteger number) {
        if (number.equals(BigInteger.ONE) || number.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        return number.multiply(calculateFactorial(number.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}
