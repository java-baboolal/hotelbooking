package com.booking.hotel.hotelbooking.controller;

import com.booking.hotel.hotelbooking.HotelBookingApplicationTests;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TestCustomerController extends HotelBookingApplicationTests {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;
    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    @Test
    public void testCustomer() throws Exception{
        mockMvc.perform(get("/findCustomer/1"))
                .andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(jsonPath("$.firstName").value("Navya"))
                .andExpect(jsonPath("$.lastName").value("Kushwah"))
                .andExpect(jsonPath("$.email").value("navyakushwah420@gmail.com"))
                .andExpect(jsonPath("$.password").value("password"))
                .andExpect(jsonPath("$.dob").value("2016-04-16"));
    }
}


