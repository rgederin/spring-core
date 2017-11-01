package com.gederin;

import com.gederin.controllers.ConstructorInjection;
import com.gederin.controllers.LombokConstructorInjection;
import com.gederin.controllers.PropertyInjection;
import com.gederin.controllers.SetterInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SuppressWarnings("ALL")
@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringCoreApplication.class, args);

		ctx.getBean(PropertyInjection.class).printFibonacciNumber(20);
		ctx.getBean(SetterInjection.class).printFibonacciNumber(60);
		ctx.getBean(ConstructorInjection.class).printFibonacciNumber(60);
		ctx.getBean(LombokConstructorInjection.class).printFibonacciNumber(60);
	}
}
