package com.geekster.WeeklyTest8102023.Controller;

import com.geekster.WeeklyTest8102023.Model.Book;
import com.geekster.WeeklyTest8102023.Model.Laptop;
import com.geekster.WeeklyTest8102023.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop newLaptop){
        return laptopService.addLaptop(newLaptop);
    }

    @GetMapping("laptops")
    public List<Laptop> getLaptop(){
        return laptopService.getAllLaptops();
    }

    @GetMapping("laptop/{id}")
    public Laptop getlaptop(@PathVariable String id){
        return laptopService.getLaptopById(id);
    }

    @DeleteMapping("delete/{id}")
    public String deleteLaptop(@PathVariable String id){
        laptopService.deleteLaptopById(id);
        return "deleted";
    }

    @PutMapping("laptop/id/{id}/price/{price}")
    public String updateLaptopPrice(@PathVariable String id,@PathVariable Integer newprice){
        return laptopService.updateLaptopPrice(id,newprice);
    }
}
