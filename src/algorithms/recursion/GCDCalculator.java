package algorithms.recursion;

import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input two integers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        scanner.close();
        var maximum = Math.max(firstNumber, secondNumber);
        var minimum = Integer.sum(firstNumber, secondNumber) - maximum;
        System.out.println("maximum = " + maximum);
        System.out.println("minimum = " + minimum);
    }

    private static int calculateGCD(int i, int i1) {
        return 0;
    }
}
