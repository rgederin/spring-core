package com.gederin.controllers;

import com.gederin.services.FibonacciComputer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjection {
    private FibonacciComputer fibonacciComputer;

    public ConstructorInjection(@Qualifier("linnearFibonacciComputer") FibonacciComputer fibonacciComputer) {
        this.fibonacciComputer = fibonacciComputer;
    }

    public void printFibonacciNumber(int n) {
        System.out.print("using " + fibonacciComputer.getClass().getSimpleName() + " ==> ");
        System.out.println("fibonacci number on poistion " + n + ": " + fibonacciComputer.computeFibonacciNumber(n));
    }
}
