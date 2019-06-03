package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Doubling;
import com.greenfoxacademy.frontend.models.Error;
import com.greenfoxacademy.frontend.models.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

  @RequestMapping("doubling")
  Message doubleInput(Integer input) {
    if (input == null) {
      return new Error(("Please provide an input!"));
    } else {
      return new Doubling(input);
    }
  }
}

