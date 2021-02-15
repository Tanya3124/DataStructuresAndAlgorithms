package algorithms.recursion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RecursiveArraySearch {
    private final int[] array;

    public RecursiveArraySearch(int size) {
        this.array = new int[size];
        fillArray();
        Arrays.sort(this.array);
        System.out.println("this.array = " + Arrays.toString(this.array));
    }

    private void fillArray() {
        for (int index = 0, size = this.array.length; index < size; index++) {
            this.array[index] = new Random().nextInt() % 100;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    private int searchRecursively(
            int value, int startIndex) {
        if (array == null || startIndex < 0 || startIndex >= array.length) {
            return -1;
        } else if (array[startIndex] == value) {
            return startIndex;
        }
        return searchRecursively(value, startIndex + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}