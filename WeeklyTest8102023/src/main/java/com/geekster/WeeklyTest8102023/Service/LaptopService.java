package com.geekster.WeeklyTest8102023.Service;

import com.geekster.WeeklyTest8102023.Model.Book;
import com.geekster.WeeklyTest8102023.Model.Laptop;
import com.geekster.WeeklyTest8102023.Repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    LaptopRepo laptopRepo;


    public String addLaptop(Laptop newLaptop) {
        laptopRepo.save(newLaptop);
        return "added";
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public Laptop getLaptopById(String id) {
        return laptopRepo.findById(id).orElseThrow();
    }

    public void deleteLaptopById(String id) {
        laptopRepo.deleteById(id);
    }

    public String updateLaptopPrice(String id, Integer newprice) {
        Laptop laptop = laptopRepo.findById(id).orElse(null);
        if(laptop != null){
            laptop.setPrice(newprice);
            laptopRepo.save(laptop);
        }
        return "laptop successfully update";
    }
}
