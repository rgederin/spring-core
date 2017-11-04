package com.gederin.lifecycle;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy()");
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("@PostConstruct");
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("@PreDestoy");
    }

}
