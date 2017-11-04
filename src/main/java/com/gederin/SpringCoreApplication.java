package com.gederin;

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

        System.out.println("\n ******************** \n");

        ctx.getBean(PropertyInjection.class).computeFibonacciNumber(45);
        ctx.getBean(SetterInjection.class).printFibonacciNumber(70);
        ctx.getBean(ConstructorInjection.class).printFibonacciNumber(70);
        ctx.getBean(LombokConstructorInjection.class).printFibonacciNumber(70);

        int[] randomArray = ctx.getBean(RandomArrayGenerator.class).generateRandomIntArray(30_000_000);
        ctx.getBean(SearchComputerController.class).findElement(randomArray, 102000);

        System.out.println("\n ******************** \n");

        ctx.getBean(StopWatchController.class).printTasksStatistics();

        System.out.println("\n ******************** \n");
    }
}
