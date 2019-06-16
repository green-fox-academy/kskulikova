package com.greenfoxacademy.todoexternaldb;

import com.greenfoxacademy.todoexternaldb.model.Todo;
import com.greenfoxacademy.todoexternaldb.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoexternaldbApplication {

  private TodoRepository todoRepository;

  TodoexternaldbApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodoexternaldbApplication.class, args);
  }
}
