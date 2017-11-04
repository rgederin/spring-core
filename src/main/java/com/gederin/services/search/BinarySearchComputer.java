package com.gederin.services.search;

import java.util.Arrays;

public class BinarySearchComputer implements SearchComputer {

    @Override
    public int search(int[] array, int element) {
        Arrays.sort(array);

        return binarySearchRecursively(array, element, 0, array.length - 1);
    }

    private int binarySearchRecursively(
            int[] sortedArray, int key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return binarySearchRecursively(
                    sortedArray, key, low, middle - 1);
        } else {
            return binarySearchRecursively(
                    sortedArray, key, middle + 1, high);
        }
    }
}
