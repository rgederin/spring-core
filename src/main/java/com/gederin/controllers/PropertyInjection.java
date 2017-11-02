package com.gederin.controllers;

import com.gederin.services.fibonacci.FibonacciComputer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.StopWatch;

@Controller
public class PropertyInjection {

    @Autowired
    @Qualifier("recursiveFibonacciComputer")
    private FibonacciComputer fibonacciComputer;

    @Autowired
    private StopWatch stopWatch;

    public void computeFibonacciNumber(int n) {
        stopWatch.start("caclulating fibonacci number with recurcive strategy");
        System.out.println("using " + fibonacciComputer.getClass().getSimpleName() + " ==> " + "fibonacci number on poistion " + n + ": " + fibonacciComputer.computeFibonacciNumber(n));
        stopWatch.stop();
    }
}
