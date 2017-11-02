package com.gederin.controllers;

import com.gederin.services.fibonacci.FibonacciComputer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.StopWatch;

@Controller
public class SetterInjection {
    private FibonacciComputer fibonacciComputer;
    private StopWatch stopWatch;

    @Autowired
    @Qualifier("binetFibonacciComputer")
    public void setFibonacciComputer(FibonacciComputer fibonacciComputer) {
        this.fibonacciComputer = fibonacciComputer;
    }

    @Autowired
    public void setStopWatch(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    public void printFibonacciNumber(int n) {
        stopWatch.start("caclulating fibonacci number with binet strategy");
        System.out.println("using " + fibonacciComputer.getClass().getSimpleName() + " ==> " + "fibonacci number on poistion " + n + ": " + fibonacciComputer.computeFibonacciNumber(n));
        stopWatch.stop();
    }
}
