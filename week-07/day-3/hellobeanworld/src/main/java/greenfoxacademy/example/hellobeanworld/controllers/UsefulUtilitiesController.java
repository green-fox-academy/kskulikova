package greenfoxacademy.example.hellobeanworld.controllers;

import greenfoxacademy.example.hellobeanworld.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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


}
