package com.delalama.AOP.beans;

import lombok.Data;

@Data
public class Employee {

    private String id;
    private String name;

    public void getMessage() {
        System.out.println("Hello, i'm a Employee");
    }
}
