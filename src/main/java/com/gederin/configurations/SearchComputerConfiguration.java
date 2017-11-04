package com.gederin.configurations;

import com.gederin.services.search.SearchComputer;
import com.gederin.services.search.SearchComputerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class SearchComputerConfiguration {

    @Bean
    public SearchComputerFactory searchComputerFactory() {
        return new SearchComputerFactory();
    }

    @Bean
    @Profile("binary")
    public SearchComputer binarySearchComputer(SearchComputerFactory searchComputerFactory) {
        return searchComputerFactory.createSearchComputer("binary");
    }

    @Bean
    @Profile({"brute", "default"})
    public SearchComputer bruteForceSearchComputer(SearchComputerFactory searchComputerFactory) {
        return searchComputerFactory.createSearchComputer("brute");
    }
}
