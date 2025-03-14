package com.company.SpringBoot_basic.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    public void compile(){
        System.out.println("desktop is compiling");
    }
}
