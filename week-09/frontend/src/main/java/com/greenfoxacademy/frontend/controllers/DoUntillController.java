package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.DoUntil;
import com.greenfoxacademy.frontend.models.Error;
import com.greenfoxacademy.frontend.models.InputUntil;
import com.greenfoxacademy.frontend.models.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntillController {

  @PostMapping("dountil/{action}")
  public Message doUntil(@PathVariable String action,
      @RequestBody(required = false) InputUntil until) {

    if (until == null) {
      return new Error("Please provide a number!");
    } else {
      return new DoUntil(until.getUntil(), action);
    }
  }
}