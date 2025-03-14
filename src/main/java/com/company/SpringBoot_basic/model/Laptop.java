package com.company.SpringBoot_basic.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

    public void compile(){
        System.out.println("laptop is compiling");
    }
}
