package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.ArraysResult;
import com.greenfoxacademy.frontend.models.Error;
import com.greenfoxacademy.frontend.models.InputArrays;
import com.greenfoxacademy.frontend.models.Message;
import com.greenfoxacademy.frontend.service.LogService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArraysController {

  private LogService logService;

  ArraysController(LogService logService) {
    this.logService = logService;
  }

  @PostMapping("arrays")
  public Message doUntil(@RequestBody(required = false) InputArrays input) {

    if (input == null) {
      return new Error("Please provide what to do with the numbers!");
    } else {
      logService.add("/arrays", "input =" + input.getNumbers());
      return new ArraysResult(input.getWhat(), input.getNumbers());
    }


  }

}
