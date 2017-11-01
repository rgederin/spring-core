package com.gederin.services;

import org.springframework.stereotype.Service;

@Service
public class RecursiveFibonacciComputer implements FibonacciComputer {

    @Override
    public long computeFibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return computeFibonacciNumber(n - 2) + computeFibonacciNumber(n - 1);
    }
}
