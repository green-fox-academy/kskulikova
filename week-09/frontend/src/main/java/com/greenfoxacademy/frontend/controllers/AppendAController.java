package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.AppendA;
import com.greenfoxacademy.frontend.models.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

  @RequestMapping("appenda/{appendable}")
  public Message appendA(@PathVariable String appendable) {
    return new AppendA(appendable);
  }
}
