package com.greenfoxacademy.frontend.controllers;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.greenfoxacademy.frontend.models.InputUntil;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@WebMvcTest(DoUntillController.class)

public class DoUntillControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));


  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private InputUntil inputUntil;

  @Test
  public void doUntil_isSuccessful() throws Exception {
    List<String> actionList = new ArrayList<String>();
    List<String> results = new ArrayList<String>();

    actionList.add("sum");
    actionList.add("factor");

    results.add("15");
    results.add("120");

    for (int i = 0; i < actionList.size() - 1; i++) {

      mockMvc.perform(post("/dountil/{action}", actionList.get(i))
          .contentType(contentType)
          .content("{\"until\": \"5\"}"))
          .andExpect(status().isOk()) // 1
          .andExpect(content().contentType(contentType))
          .andExpect(jsonPath("$.result").exists())
          .andExpect(jsonPath("$.result").value(results.get(i)));
    }
  }
}