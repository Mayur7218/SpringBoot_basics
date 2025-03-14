package com.company.SpringBoot_basic;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public Laptop(){
        System.out.println("Laptop Constructor");
    }

    public void compiling(){
        System.out.println("laptop is compiling");
    }
}
