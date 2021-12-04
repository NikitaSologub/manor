package by.itacademy.sologub.model;

public class AbstractBean {
    public void init() {
        System.out.println("init " + this.getClass().getSimpleName());
    }

    public void destroy() {
        System.out.println("destroy " + this.getClass().getSimpleName());
    }
}