package com.allstate.controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(LinearEquationController.class)
public class LinearEquationControllerTest {

    @Autowired
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCalculateDistanceBetweenTwoPoints() throws Exception {
        MockHttpServletRequestBuilder request = post("/linear/distance")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[{\"xCoordinate\":1, \"yCoordinate\":2},{\"xCoordinate\":3, \"yCoordinate\":1}]");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.distance", is(closeTo(2.2, 0.1))));

    }

    @Test
    public void shouldCalculateSlopeBetweenTwoPoints() throws Exception {
        MockHttpServletRequestBuilder request = post("/linear/slope")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[{\"xCoordinate\":1, \"yCoordinate\":2},{\"xCoordinate\":3, \"yCoordinate\":1}]");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.slope", is(closeTo(-0.5, 0.1))));

    }

    @Test
    public void shouldCalculateYInterceptBetweenTwoPoints() throws Exception {
        MockHttpServletRequestBuilder request = post("/linear/yIntercept")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[{\"xCoordinate\":1, \"yCoordinate\":2},{\"xCoordinate\":3, \"yCoordinate\":1}]");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.yIntercept", is(closeTo(1.5, 0.1))));

    }

}