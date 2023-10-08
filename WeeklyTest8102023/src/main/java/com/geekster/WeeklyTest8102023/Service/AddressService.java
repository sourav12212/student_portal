package com.geekster.WeeklyTest8102023.Service;

import com.geekster.WeeklyTest8102023.Model.Address;
import com.geekster.WeeklyTest8102023.Repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    public String addAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "address added";
    }

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Address getAddressById(Long id) {
        return addressRepo.findById(id).orElseThrow();
    }

    public String deleteAddressById(Long id) {
        addressRepo.deleteById(id);
        return "successfully deleted";
    }
}
