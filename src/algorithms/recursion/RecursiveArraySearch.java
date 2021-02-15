package algorithms.recursion;

import java.util.Arrays;
import java.util.Random;

public class RecursiveArraySearch {
    private int[] array;

    public RecursiveArraySearch(int size) {
        this.array = new int[size];
        fillArray();
        Arrays.sort(array);
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

    int fact(int n) {
        return n * fact(n - 1);
    }
}