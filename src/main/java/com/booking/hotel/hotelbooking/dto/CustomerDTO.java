package com.booking.hotel.hotelbooking.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.Instant;

@Data
public class CustomerDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String dob;
    private String email;
    private String password;
}
