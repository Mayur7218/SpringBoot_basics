package com.company.SpringBoot_basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    private Laptop laptop;

    public Alien(){
        System.out.println("Alien Constructor");
    }

    public void code(){
        laptop.compiling();
    }
}
