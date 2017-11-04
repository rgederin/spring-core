package com.gederin.services;


public class RandomArrayGenerator {

    public int[] generateRandomIntArray(int numElements) {
        // Generate an array of integers
        int[] randomInts = new int[numElements];
        for (int i = 0; i < numElements; ++i) {
            randomInts[i] = i;
        }

        // Do the Knuth shuffle
        for (int i = 0; i < numElements; ++i) {
            int randomIndex = (int) Math.floor(Math.random() * (i + 1));
            Integer temp = randomInts[i];
            randomInts[i] = randomInts[randomIndex];
            randomInts[randomIndex] = temp;
        }

        return randomInts;
    }
}
