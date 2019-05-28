package com.greenfoxacademy.todoexternaldb.controllers;


import com.greenfoxacademy.todoexternaldb.model.Todo;
import com.greenfoxacademy.todoexternaldb.repository.TodoRepository;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository todoRepository;

  TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping({"/", "/list"})
  public String list(Model model,
      @RequestParam(value = "isActive", required = false) String isActive) {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    if (isActive.equals("true")) {
      todos = todos.stream().filter(t -> !t.isDone()).collect(Collectors.toList());
    } else if (isActive.equals("false")) {
      todos = todos.stream().filter(t -> t.isDone()).collect(Collectors.toList());
    }

    model.addAttribute("todos", todos);
    return "todo";
  }
}
