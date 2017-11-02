package com.gederin;

import com.gederin.controllers.ConstructorInjection;
import com.gederin.controllers.LombokConstructorInjection;
import com.gederin.controllers.PropertyInjection;
import com.gederin.controllers.SetterInjection;
import com.gederin.controllers.StopWatchController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SuppressWarnings("ALL")
@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringCoreApplication.class, args);

        System.out.println("\n ******************** \n");

        ctx.getBean(PropertyInjection.class).computeFibonacciNumber(43);
        ctx.getBean(SetterInjection.class).printFibonacciNumber(70);
        ctx.getBean(ConstructorInjection.class).printFibonacciNumber(70);
        ctx.getBean(LombokConstructorInjection.class).printFibonacciNumber(70);

        System.out.println("\n ******************** \n");

        ctx.getBean(StopWatchController.class).printFibonacciExecutionStatistics();

        System.out.println("\n ******************** \n");
    }
}
