package com.gederin.controllers;

import com.gederin.services.FibonacciComputer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LombokConstructorInjection {
    private FibonacciComputer fibonacciComputer;

    public void printFibonacciNumber(int n) {
        System.out.print("using " + fibonacciComputer.getClass().getSimpleName() + " ==> ");
        System.out.println("fibonacci number on poistion " + n + ": " + fibonacciComputer.computeFibonacciNumber(n));
    }
}
