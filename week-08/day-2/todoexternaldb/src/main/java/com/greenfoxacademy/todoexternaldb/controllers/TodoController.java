package com.greenfoxacademy.todoexternaldb.controllers;

import com.greenfoxacademy.todoexternaldb.model.Assignee;
import com.greenfoxacademy.todoexternaldb.model.Todo;
import com.greenfoxacademy.todoexternaldb.service.AssigneeService;
import com.greenfoxacademy.todoexternaldb.service.IAssigneeService;
import com.greenfoxacademy.todoexternaldb.service.IToDoService;
import com.greenfoxacademy.todoexternaldb.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = {"/", "/todo"})
public class TodoController {

  private IToDoService todoService;
  private IAssigneeService assigneeService;

  TodoController(TodoService todoService, AssigneeService assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

  @RequestMapping({"", "/", "/list"})
  public String list(Model model,
      @RequestParam(value = "isActive", required = false) boolean isActive) {
    model.addAttribute("todos", todoService.getActiveTodos(isActive));
    model.addAttribute("assignees", assigneeService.findAllAssignees());
    return "todo";
  }

//  @GetMapping("/add")
//  public String getNewTodo() {
//    return "redirect:/todo/";
//  }

  @PostMapping("/add")
  public String addTodo(@RequestParam String title, @RequestParam String assigneeName) {
    Todo newTodo = new Todo((title));
    Assignee designatedAssignee = assigneeService.findAssigneeByName(assigneeName);
    newTodo.setAssignee(designatedAssignee);
    todoService.saveTodo(newTodo);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/{id}/delete")
  public String deleteTodo(@PathVariable Long id) {
    todoService.deleteTodo(id);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/edit/{id}")
  public String editOneTodo(@PathVariable Long id, Model model) {
    model.addAttribute("id", id);
    model.addAttribute("assignees", assigneeService.findAllAssignees());
    return "edit";
  }

  @PostMapping(value = "/edit/{id}")
  public String editTodo(@PathVariable long id, boolean urgent,
      boolean done, String text, Long assignee) {
    todoService.editTodo(id, urgent, done, text, assignee);
    return "redirect:/todo/";
  }

  @PostMapping()
  public String search(String search, Model model) {
    todoService.search(search);
    model.addAttribute("todos", todoService.search(search));
    return "todo";
  }

}

