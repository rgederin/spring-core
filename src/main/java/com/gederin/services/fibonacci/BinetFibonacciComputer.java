package com.gederin.services.fibonacci;

import org.springframework.stereotype.Service;

@Service
public class BinetFibonacciComputer implements FibonacciComputer {

    @Override
    public long computeFibonacciNumber(int n) {
        return (long) ((Math.pow(1 + Math.sqrt(5), n) - Math.pow(1 - Math.sqrt(5), n)) /
                (Math.pow(2, n) * Math.sqrt(5)));
    }
}
