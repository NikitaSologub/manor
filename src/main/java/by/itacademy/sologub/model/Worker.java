package by.itacademy.sologub.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString(includeFieldNames = false)
@AllArgsConstructor
@Data
public class Worker extends AbstractBean {
    private int id;
    private String name;
    private String sureName;

    public Worker() {
    }

    public Worker(int id) {
        this.id = id;
    }
}