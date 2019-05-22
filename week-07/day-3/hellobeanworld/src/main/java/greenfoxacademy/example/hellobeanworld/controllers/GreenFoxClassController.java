package greenfoxacademy.example.hellobeanworld.controllers;

import greenfoxacademy.example.hellobeanworld.services.GreenFoxServiceable;
import greenfoxacademy.example.hellobeanworld.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gfa")
public class GreenFoxClassController {

  private final GreenFoxServiceable service;

  public GreenFoxClassController(
      @Qualifier("FileWriter") GreenFoxServiceable service) {
    this.service = service;
  }

  @GetMapping()
  public String mainPage(Model model) {
    int count = service.count();
    model.addAttribute("count", count);
    return "gfa";
  }

  @GetMapping("/list")
  public String listStudents(Model model) {
    model.addAttribute("list", service.findAll());
    return "students";
  }

  @GetMapping("/add")
  public String addStudents() {
    return "add";
  }

  @GetMapping("/save")
  public String saveStudents(String name) {
    service.save(name);
    return "redirect:/gfa/list";
  }

  @GetMapping("/check")
  public String checkStudents() {
    return "check";
  }

  @PostMapping("/check")
  public String isStudent(String name, Model model) {
    model.addAttribute("message", service.check(name));
    return "check";
  }

}
