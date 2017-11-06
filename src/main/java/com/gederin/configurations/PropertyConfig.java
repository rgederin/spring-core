package com.gederin.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:search.properties")
public class PropertyConfig {

    @Value("${fibonacci.recursive}")
    private int recursive;

    @Value("${fibonacci.binet}")
    private int binet;

    @Value("${fibonacci.linnear}")
    private int linnear;

    @Value("${search.array.size}")
    private int searchArraySize;

    @Bean
    public FibonacciProperties fibonacciProperties() {
        FibonacciProperties fibonacciProperties = new FibonacciProperties();

        fibonacciProperties.setRecursive(recursive);
        fibonacciProperties.setBinet(binet);
        fibonacciProperties.setLinnear(linnear);

        return fibonacciProperties;
    }

    @Bean
    public SearchProperties searchProperties() {
        SearchProperties searchProperties = new SearchProperties();

        searchProperties.setSearchArraySize(searchArraySize);

        return searchProperties;
    }
}
