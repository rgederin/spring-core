package com.gederin.services.search;

public class BruteForceSearchComputer implements SearchComputer {

    @Override
    public int search(int[] array, int element) {
        int result = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                result = i;
                break;
            }
        }

        return result;
    }
}
