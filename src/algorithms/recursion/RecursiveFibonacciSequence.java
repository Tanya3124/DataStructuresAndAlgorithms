package algorithms.recursion;

public class RecursiveFibonacciSequence {
    private static int findFibonacciTerm(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return findFibonacciTerm(index - 1) + findFibonacciTerm(index - 2);
    }

    public static void main(String[] args) {

    }
}
