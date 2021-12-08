package by.itacademy.sologub.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AbstractBean {
    @PostConstruct
    public void init() {
        System.out.println("init " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy " + this.getClass().getSimpleName());
    }
}