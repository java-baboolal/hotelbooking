package com.booking.hotel.hotelbooking.service;

import com.booking.hotel.hotelbooking.dto.CustomerDTO;
import com.booking.hotel.hotelbooking.entity.Customer;
import com.booking.hotel.hotelbooking.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public String createCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setFirstName(customerDTO.getFirstName());
        customer.setLastName(customerDTO.getLastName());
        //String dob [] = customerDTO.getDob().split("-");
       // customer.setDob(LocalDate.of(Integer.valueOf(dob[0]),Integer.valueOf(dob[1]),Integer.valueOf(dob[2])));
        customer.setDob(customerDTO.getDob());
        customer.setEmail(customerDTO.getEmail());
        customer.setPassword(customerDTO.getPassword());

        Customer savedCustomer = customerRepository.save(customer);
        String message = "";
        if(savedCustomer == null)
            message="customer not saved in database.";
        else
            message="customer is saved successfully in database.";
        return message;
    }

    @Override
    public CustomerDTO findCustomer(Long id) {
        Customer customer = customerRepository.findOne(id);
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setDob(customer.getDob());
        customerDTO.setFirstName(customer.getFirstName());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setLastName(customer.getLastName());
        customerDTO.setPassword(customer.getPassword());
        return customerDTO;
    }
}
