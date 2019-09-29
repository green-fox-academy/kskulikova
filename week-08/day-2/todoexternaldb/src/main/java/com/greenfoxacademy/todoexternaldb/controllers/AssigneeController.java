package com.greenfoxacademy.todoexternaldb.controllers;

import com.greenfoxacademy.todoexternaldb.model.Assignee;
import com.greenfoxacademy.todoexternaldb.service.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@RequestMapping(value = {"/", "/todo"})
public class AssigneeController {

  private AssigneeService assigneeService;

  AssigneeController(AssigneeService assigneeService) {

    this.assigneeService = assigneeService;
  }

  @GetMapping("/assignees")
  public String listAssignees(Model model, @ModelAttribute String assigneeError) {
    model.addAttribute("assignees", assigneeService.findAllAssignees());
    return "assignees";
  }

  @GetMapping("/assignees/add")
  public String getNewAssignee() {
    return "addAssignee";
  }

  @PostMapping("/assignees/add")
  public String addAssignee(@RequestParam String name, String email, RedirectAttributes redirectAttributes, Model model) {
    String assigneeError;
    if (assigneeService.findAssigneeByName(name) != null) {
      assigneeError = "true";
    } else {
      assigneeService.saveAssignee(new Assignee(name, email));
      assigneeError = "";
    }
    redirectAttributes.addFlashAttribute("assigneeError", assigneeError);
    return "redirect:/assignees";
  }

  @GetMapping(value = "assignees/{id}/delete")
  public String deleteTodo(@PathVariable Long id) {
    assigneeService.deleteAssignee(id);
    return "redirect:/todo/assignees";
  }

  @GetMapping(value = "assignees/edit/{id}")
  public String editOneAssignee(@PathVariable Long id, Model model) {
    model.addAttribute("id", id);
    return "assigneeEdit";
  }

  @PostMapping(value = "assignees/edit/{id}")
  public String editAssignee(@PathVariable Long id, String name) {
    assigneeService.editAssignee(id, name);
    return "redirect:/todo/assignees";
  }

  @GetMapping(value = "alltodo/{id}")
  public String allTodoByAssignee(@PathVariable Long id, Model model) {
    model.addAttribute("assignee", assigneeService.getAssignee(id));
    return "todoByAssignee";
  }

}
