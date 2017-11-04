package com.gederin.services.search;

public class SearchComputerFactory {

    public SearchComputer createSearchComputer(String type) {
        switch (type) {
            case "brute":
                return new BruteForceSearchComputer();
            case "binary":
                return new BinarySearchComputer();
            default:
                return new BinarySearchComputer();
        }
    }
}
