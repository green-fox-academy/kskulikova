package com.greenfoxacademy.todoexternaldb.service;

import com.greenfoxacademy.todoexternaldb.model.Todo;
import com.greenfoxacademy.todoexternaldb.repository.AssigneeRepository;
import com.greenfoxacademy.todoexternaldb.repository.TodoRepository;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements IToDoService {

  private TodoRepository todoRepository;
  private AssigneeRepository assigneeRepository;

  TodoService(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
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

  public void saveTodo(Todo todo) {
    todoRepository.save(todo);
  }

  public void deleteTodo(long id) {
    todoRepository.delete(todoRepository.findById(id).orElse(null));
  }

  public void editTodo(long id, boolean urgent,
      boolean done, String text, long assignee_id) {
    Todo todo = todoRepository.findById(id).get();

    todo.setTitle(text);
    todo.setUrgent(urgent);
    todo.setDone(done);
    todo.setAssignee(assigneeRepository.findById(assignee_id).get());

    todoRepository.save(todo);
  }

  public List<Todo> search(String search) {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    return todos.stream().filter(f -> f.getTitle().toLowerCase().contains(search.toLowerCase()))
        .collect(Collectors.toList());
  }
}
