package com.greenfoxacademy.frontend.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(AppendAController.class)

public class AppendAControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void appendA_isSuccessful() throws Exception {

    List<String> inputs = new ArrayList<>();
    List<String> results = new ArrayList<>();

    inputs.add("kind");
    inputs.add("nigg");
    inputs.add("motherfuck");

    results.add("kinda");
    results.add("nigga");
    results.add("motherfucka");

    for (int i = 0; i < inputs.size() - 1; i++) {
      mockMvc.perform(get("/appenda/{appendable}", inputs.get(i)))
          .andExpect(status().isOk()) // 1
          .andExpect(content().contentType(contentType))
          .andExpect(jsonPath("$.appended").exists())
          .andExpect(jsonPath("$.appended").value(results.get(i)));
    }
  }
}