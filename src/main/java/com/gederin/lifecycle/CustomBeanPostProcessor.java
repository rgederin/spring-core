package com.gederin.lifecycle;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("initialising " + beanName + " bean");

        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("bean " + beanName + " was initialised");

        return bean;
    }
}
