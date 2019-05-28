package com.greenfoxacademy.tododatabase.controllers;

import com.greenfoxacademy.tododatabase.models.Todo;
import com.greenfoxacademy.tododatabase.repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository todoRepository;

  TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping({"/", "/list"})
  public String list(Model model) {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    model.addAttribute("todos", todos);
    return "todo";
  }
}
