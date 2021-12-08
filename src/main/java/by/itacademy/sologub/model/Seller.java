package by.itacademy.sologub.model;

import by.itacademy.sologub.qualifiers.SellerQualifier;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@SellerQualifier
public class Seller extends Worker {
    public Seller(int id, String name, String sureName) {
        super(id, name, sureName);
    }

    @Override
    public String toString() {
        return "Seller{ " + getId() + " | " + getName() + " | " + getSureName() + " }";
    }
}