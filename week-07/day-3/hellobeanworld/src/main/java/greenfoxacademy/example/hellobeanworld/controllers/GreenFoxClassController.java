package greenfoxacademy.example.hellobeanworld.controllers;

import greenfoxacademy.example.hellobeanworld.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gfa")
public class GreenFoxClassController {

  private StudentService studentService;

  GreenFoxClassController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping()
  public String mainPage(Model model) {
    model.addAttribute("count", studentService.count());
    return "gfa";
  }

  @GetMapping("/list")
  public String listStudents(Model model) {
    model.addAttribute("list", studentService.findAll());
    return "students";
  }

  @GetMapping("/add")
  public String addStudents() {
    return "add";
  }

  @GetMapping("/save")
  public String saveStudents(String name) {
    studentService.save(name);
    return "redirect:gfa/list";
  }


}
