package by.itacademy.sologub.model;

import by.itacademy.sologub.qualifiers.SmithQualifier;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@SmithQualifier

public class Smith extends Worker {
    public Smith(int id, String name, String sureName) {
        super(id, name, sureName);
    }

    @Override
    public String toString() {
        return "Smith{ " + getId() + " | " + getName() + " | " + getSureName() + " }";
    }
}