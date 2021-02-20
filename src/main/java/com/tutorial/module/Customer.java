package com.tutorial.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author maximilian lamm brain.free.kontakt@gmail.com
 * @project CoustomerOrderTutorial
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String _firstName;
    private String _lastName;
    private String _location;
    private int _id;

    public Customer(String firstName, String lastName, int id) {
        _id =id;
        _firstName = firstName;
        _lastName = lastName;
    }
}
