package com.tutorial;

import com.tutorial.module.Customer;
import com.tutorial.module.Product;

/**
 * @author maximilian lamm brain.free.kontakt@gmail.com
 * @project CoustomerOrderTutorial
 */
public class Main {
    public static void main(String[] args) {
        Product cola = new Product("Coca Cola 1.5l", 12.12, 1);
        System.out.println(cola.get_price());
        Customer greiner = new Customer("Marcus", "Greiner", 1);
        System.out.println(greiner.get_id());
    }
}
