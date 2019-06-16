package com.greenfoxacademy.tododatabase;

import com.greenfoxacademy.tododatabase.models.Todo;
import com.greenfoxacademy.tododatabase.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TododatabaseApplication implements CommandLineRunner {

  private TodoRepository todoRepository;

  TododatabaseApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TododatabaseApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    todoRepository.save(new Todo("Have some coffee"));
    todoRepository.save(new Todo("Go for a walk"));
  }
}
