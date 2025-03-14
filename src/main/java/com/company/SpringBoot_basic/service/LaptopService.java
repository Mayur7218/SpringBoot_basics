package com.company.SpringBoot_basic.service;

import com.company.SpringBoot_basic.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        repo.add(lap);
    }
}
