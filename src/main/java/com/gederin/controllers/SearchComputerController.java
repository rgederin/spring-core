package com.gederin.controllers;

import com.gederin.services.search.SearchComputer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StopWatch;

@Controller
public class SearchComputerController {

    private SearchComputer searchComputer;
    private StopWatch stopWatch;

    @Autowired
    public SearchComputerController(SearchComputer searchComputer, StopWatch stopWatch) {
        this.searchComputer = searchComputer;
        this.stopWatch = stopWatch;
    }

    public void findElement(int[] array, int key) {
        String claaName = searchComputer.getClass().getSimpleName();
        stopWatch.start("searching for an element in array using " + claaName);
        System.out.println("using " + claaName + " ==> index of " + key + " in shuffled arrays is: "
                + searchComputer.search(array, key));
        stopWatch.stop();
    }
}
