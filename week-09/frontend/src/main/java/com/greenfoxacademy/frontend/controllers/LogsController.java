package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.AllLogs;
import com.greenfoxacademy.frontend.service.LogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogsController {

  private final LogService logService;

  public LogsController(LogService logService) {
    this.logService = logService;
  }

  @GetMapping("logs")
  AllLogs getLogs() {
    return new AllLogs(logService);
  }

}
