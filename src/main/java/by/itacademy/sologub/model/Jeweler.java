package by.itacademy.sologub.model;

import by.itacademy.sologub.qualifiers.JewelerQualifier;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@JewelerQualifier
public class Jeweler extends Worker {
    public Jeweler(int id, String name, String sureName) {
        super(id, name, sureName);
    }

    public void startJeweler() {
        System.out.println("Start " + this.getClass().getSimpleName() + " " + this.getName() + " " + this.getSureName() + " object");
    }

    public void finishJeweler() {
        System.out.println("Finish " + this.getClass().getSimpleName() + " " + this.getName() + " " + this.getSureName() + " object");
    }

    @Override
    public String toString() {
        return "Jeweler{ " + getId() + " | " + getName() + " | " + getSureName() + " }";
    }
}