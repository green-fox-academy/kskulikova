package com.greenfoxacademy.todoexternaldb.repository;

import com.greenfoxacademy.todoexternaldb.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
