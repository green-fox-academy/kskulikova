package com.greenfoxacademy.todoexternaldb.controllers;


import com.greenfoxacademy.todoexternaldb.model.Todo;
import com.greenfoxacademy.todoexternaldb.repository.TodoRepository;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
      @RequestParam(value = "isActive", required = false) boolean isActive) {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    if (isActive) {
      todos = todos.stream().filter(t -> !t.isDone()).collect(Collectors.toList());
    }
    model.addAttribute("todos", todos);
    return "todo";
  }

  @GetMapping("/add")
  public String getNewTodo() {
    return "add";
  }

  @PostMapping("/add")
  public String addTodo(@RequestParam String text) {
    todoRepository.save(new Todo(text));
    return "redirect:/todo/";
  }

  @GetMapping(value = "/{id}/delete")
  public String deleteTodo(@PathVariable Long id) {
    todoRepository.delete(todoRepository.findById(id).orElse(null));
    return "redirect:/todo/";
  }

  @GetMapping(value = "/{id}/edit")
  public String editOneTodo(@PathVariable Long id, Model model) {
    model.addAttribute("id", id);
    return "edit";
  }

  @PostMapping(value = "/edit/{id}")
  public String editTodo(@PathVariable long id, boolean urgent,
      boolean done, String text) {
    Todo todo = todoRepository.findById(id).get();
    todo.setTitle(text);
    todo.setUrgent(urgent);
    todo.setDone(done);
    todoRepository.save(todo);
    return "redirect:/todo/";
  }
}

