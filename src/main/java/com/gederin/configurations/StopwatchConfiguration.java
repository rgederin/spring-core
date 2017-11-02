package com.gederin.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

@Configuration
public class StopwatchConfiguration {

    @Bean
    public StopWatch createStopWatch() {
        return new StopWatch();
    }
}
