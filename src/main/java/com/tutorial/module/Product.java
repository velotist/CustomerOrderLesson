package com.tutorial.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String _name;
    private Double _price;
    private Integer _articleNumber;

    public Product(String name, Integer articleNumber) {
        _name = name;
        _articleNumber = articleNumber;
    }
}
