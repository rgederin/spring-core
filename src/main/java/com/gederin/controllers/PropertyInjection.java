package com.gederin.controllers;

import com.gederin.services.FibonacciComputer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjection {

    @Autowired
    @Qualifier ("recursiveFibonacciComputer")
    private FibonacciComputer fibonacciComputer;

    public void printFibonacciNumber(int n) {
        System.out.print("using " + fibonacciComputer.getClass().getSimpleName() + " ==> ");
        System.out.println("fibonacci number on poistion " + n + ": " + fibonacciComputer.computeFibonacciNumber(n));
    }
}
