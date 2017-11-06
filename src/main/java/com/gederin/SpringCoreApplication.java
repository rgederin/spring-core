package com.gederin;

import com.gederin.configurations.FibonacciProperties;
import com.gederin.configurations.SearchProperties;
import com.gederin.controllers.SearchComputerController;
import com.gederin.controllers.StopWatchController;
import com.gederin.controllers.injections.ConstructorInjection;
import com.gederin.controllers.injections.LombokConstructorInjection;
import com.gederin.controllers.injections.PropertyInjection;
import com.gederin.controllers.injections.SetterInjection;
import com.gederin.services.RandomArrayGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SuppressWarnings("ALL")
@SpringBootApplication
@ImportResource("classpath:generator-config.xml")
public class SpringCoreApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringCoreApplication.class, args);

        FibonacciProperties fibonacciProperties = ctx.getBean(FibonacciProperties.class);
        SearchProperties searchProperties = ctx.getBean(SearchProperties.class);

        System.out.println("\n ******************** \n");

        ctx.getBean(PropertyInjection.class).computeFibonacciNumber(fibonacciProperties.getRecursive());
        ctx.getBean(SetterInjection.class).printFibonacciNumber(fibonacciProperties.getBinet());
        ctx.getBean(ConstructorInjection.class).printFibonacciNumber(fibonacciProperties.getLinnear());
        ctx.getBean(LombokConstructorInjection.class).printFibonacciNumber(fibonacciProperties.getLinnear());

        int[] randomArray = ctx.getBean(RandomArrayGenerator.class).generateRandomIntArray(searchProperties.getSearchArraySize());
        ctx.getBean(SearchComputerController.class).findElement(randomArray, 102000);

        System.out.println("\n ******************** \n");

        ctx.getBean(StopWatchController.class).printTasksStatistics();

        System.out.println("\n ******************** \n");
    }
}
