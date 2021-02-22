package com.booking.hotel.hotelbooking.controller;

import com.booking.hotel.hotelbooking.dto.CustomerDTO;
import com.booking.hotel.hotelbooking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome in hotel booking service.";
    }

    @PostMapping("/createCustomer")
    public String createCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.createCustomer(customerDTO);
    }

    @GetMapping("/findCustomer/{id}")
    public CustomerDTO findCustomer(@PathVariable Long id){
        return customerService.findCustomer(id);
    }
}
