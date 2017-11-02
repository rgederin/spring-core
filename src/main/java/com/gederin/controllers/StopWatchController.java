package com.gederin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StopWatch;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StopWatchController {

    private StopWatch stopWatch;

    public void printFibonacciExecutionStatistics() {
        System.out.println(stopWatch.prettyPrint());
    }
}
