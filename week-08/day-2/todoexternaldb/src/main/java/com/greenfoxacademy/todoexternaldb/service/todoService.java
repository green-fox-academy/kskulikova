package com.greenfoxacademy.todoexternaldb.service;

import com.greenfoxacademy.todoexternaldb.model.Todo;
import com.greenfoxacademy.todoexternaldb.repository.TodoRepository;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class todoService {

  private TodoRepository todoRepository;

  todoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public List<Todo> getActiveTodos(boolean isActive) {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    if (isActive) {
      todos = todos.stream().filter(t -> !t.isDone()).collect(Collectors.toList());
    }
    todos.sort(Comparator.comparing(Todo::getId));
    return todos;
  }

  public void save(Todo todo) {
    todoRepository.save(todo);
  }

  public void delete(long id) {
    todoRepository.delete(todoRepository.findById(id).orElse(null));
  }

  public void edit(long id, boolean urgent,
      boolean done, String text) {
    Todo todo = todoRepository.findById(id).get();
    todo.setTitle(text);
    todo.setUrgent(urgent);
    todo.setDone(done);
    todoRepository.save(todo);
  }

  public List<Todo> search(String search) {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    return todos.stream().filter(f -> f.getTitle().toLowerCase().contains(search.toLowerCase()))
        .collect(Collectors.toList());
  }
}
