package com.gederin.controllers.injections;

import com.gederin.services.fibonacci.FibonacciComputer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StopWatch;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LombokConstructorInjection {
    private FibonacciComputer fibonacciComputer;
    private StopWatch stopWatch;

    public void printFibonacciNumber(int n) {
        stopWatch.start("caclulating fibonacci number with linnear strategy");
        System.out.println("using " + fibonacciComputer.getClass().getSimpleName() + " ==> " + "fibonacci number on poistion " + n + ": " + fibonacciComputer.computeFibonacciNumber(n));
        stopWatch.stop();
    }
}
