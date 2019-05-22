package greenfoxacademy.example.hellobeanworld.controllers;

import greenfoxacademy.example.hellobeanworld.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {

  private UtilityService utilityService;

  UsefulUtilitiesController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String getUtilities() {
    return "utilities";
  }

  @GetMapping("/useful/colored")
  public String getColor(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String checkEmail(@RequestParam String email, Model model) {
    model.addAttribute("email", email);
    model.addAttribute("valid", utilityService.isEmailValid(email));
    return "email";
  }

  @GetMapping("/useful/caesar/decode")
  public String caesarDecode(@RequestParam String word, @RequestParam int number, Model model) {
    model.addAttribute("result", utilityService.caesar(word, -number));
    return "caesar";
  }

  @GetMapping("/useful/caesar/encode")
  public String caesarEncode(@RequestParam String word, @RequestParam int number, Model model) {
    model.addAttribute("result", utilityService.caesar(word, number));
    return "caesar";
  }

}
