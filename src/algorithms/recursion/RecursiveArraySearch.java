package algorithms.recursion;

import java.util.Random;

public class RecursiveArraySearch {
    private int[] array;

    public RecursiveArraySearch(int size) {
        this.array = new int[size];
        fillArray();
    }

    private void fillArray() {
        for (int index = 0, size = this.array.length; index < size; index++) {
            this.array[index] = new Random().nextInt() % 100;
        }
    }
}
