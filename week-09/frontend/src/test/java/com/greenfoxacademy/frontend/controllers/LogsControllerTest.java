package com.greenfoxacademy.frontend.controllers;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.greenfoxacademy.frontend.models.Log;
import com.greenfoxacademy.frontend.service.LogService;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@RunWith(SpringRunner.class)
@WebMvcTest(LogsController.class)
public class LogsControllerTest {

  @Autowired
  MockMvc mockMvc;

  @MockBean
  LogService logService;

  @Test
  public void getlogs_isSuccessful() throws Exception {

    Log log = new Log();
    log.setEndpoint("/greeter");

    List<Log> logs = new ArrayList<>();
    logs.add(log);

    when(logService.findAll()).thenReturn(logs);
    when(logService.count()).thenReturn(1);

    mockMvc.perform(get("/logs"))
        .andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.jsonPath("$.logs[0].endpoint").value("/greeter"))
        .andDo(result -> System.out.println(result.getResponse().getStatus()));
  }
}