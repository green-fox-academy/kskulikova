package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.AllLogs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogsController {

  @Autowired
  private AllLogs allLogs;

  @RequestMapping("logs")
  AllLogs getLogs() {
    return allLogs;
  }

}
