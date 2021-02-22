package com.booking.hotel.hotelbooking.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(value = CustomerController.class)
@WithMockUser
public class CustomerControllerTest {

    //@Autowired
    //CustomerService customerService;

    @Test
    public void retrieveCustomerDetail(){
        /*Mockito.when(
                customerService.findCustomer(Mockito.anyString(),
                        Mockito.anyString())).thenReturn(mockCourse);

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/findCustomer/1").accept(
                MediaType.APPLICATION_JSON);

        Tool mockMvc;
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        System.out.println(result.getResponse());
        String expected = "{id:Course1,name:Spring,description:10Steps}";

        // {"id":"Course1","name":"Spring","description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven","Import Project","First Example","Second Example"]}

        JSONAssert.assertEquals(expected, result.getResponse()
                .getContentAsString(), false); */
    }
}
