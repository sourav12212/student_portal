package com.geekster.WeeklyTest8102023.Controller;

import com.geekster.WeeklyTest8102023.Model.Address;
import com.geekster.WeeklyTest8102023.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress){
        return addressService.addAddress(newAddress);
    }

    @GetMapping("address")
    public List<Address> getAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("address/{id}")
    public Address getAddress(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @DeleteMapping("address/{id}")
    public String deleteAddress(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }
}
