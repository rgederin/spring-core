package com.gederin.services.fibonacci;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class LinnearFibonacciComputer implements FibonacciComputer {

    @Override
    public long computeFibonacciNumber(int n) {
        if (n <= 2) {
            return 1;
        }

        long preLast = 1;
        long last = 1;

        long answer = 0;

        for (int i = 2; i < n; i++) {
            answer = preLast + last;
            preLast = last;
            last = answer;
        }

        return answer;
    }
}
