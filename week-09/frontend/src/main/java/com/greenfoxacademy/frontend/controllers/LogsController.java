package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Log;
import com.greenfoxacademy.frontend.models.Message;
import com.greenfoxacademy.frontend.service.LogService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogsController {

  private LogService logService;

  LogsController(LogService logService) {
    this.logService = logService;
  }

  @RequestMapping("logs")
  List<Log> getLogs() {
    return logService.findAll();
  }

}
