package com.greenfox.simpleapp;

import com.greenfox.simpleapp.controllers.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Equals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloWorld_basic() throws Exception {

        //call GET "/hello-world" application/jason
        RequestBuilder request = MockMvcRequestBuilders
                .get("/hello-world").accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"))  // toto a asser sa musia rovnat
                .andReturn();

        //verify "HEllo World"
        assertEquals("Hello World", result.getResponse().getContentAsString());
    }
}
