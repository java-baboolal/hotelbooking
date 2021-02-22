package com.booking.hotel.hotelbooking.service;

import com.booking.hotel.hotelbooking.dto.CustomerDTO;

public interface CustomerService {
    String createCustomer(CustomerDTO customerDTO);

    CustomerDTO findCustomer(Long id);
}
