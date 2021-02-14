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
}