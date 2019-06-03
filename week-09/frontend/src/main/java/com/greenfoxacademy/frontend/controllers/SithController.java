package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Error;
import com.greenfoxacademy.frontend.models.InputText;
import com.greenfoxacademy.frontend.models.Message;
import com.greenfoxacademy.frontend.models.SithText;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SithController {

  @PostMapping("sith")
  Message translateToSith(@RequestBody InputText inputText) {
    if (inputText == null) {
      return new Error("Feed me some text you have to, padawan young you are. Hmmm.");
    }
    return new SithText(inputText.getText());
  }

}
