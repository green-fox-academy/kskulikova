package com.greenfoxacademy.frontend.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import java.nio.charset.Charset;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.ResultMatcher;


@RunWith(SpringRunner.class)
@WebMvcTest(DoublingController.class)

public class DoublingControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void doubleInput_isSuccessful() throws Exception {

    String input = "15";

    mockMvc.perform(get("/doubling")
        .param("input", input))
        .andExpect(status().isOk()) // 1
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.received").exists())
        .andExpect(jsonPath("$.received").value("15"))
        .andExpect(jsonPath("$.result").value("30"));
  }
}