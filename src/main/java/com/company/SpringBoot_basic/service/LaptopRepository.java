package com.company.SpringBoot_basic.service;

import com.company.SpringBoot_basic.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void add(Laptop lap){
        System.out.println("saved in database");
    }
}
