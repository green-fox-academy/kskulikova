package com.greenfoxacademy.todoexternaldb.service;

import com.greenfoxacademy.todoexternaldb.model.Todo;
import java.util.List;

public interface IToDoService {
  List<Todo> getActiveTodos(boolean isActive);
  void saveTodo(Todo todo);
  void deleteTodo(long id);
  void editTodo(long id, boolean urgent,
      boolean done, String text, long assignee_id);
  List<Todo> search(String search);

}
