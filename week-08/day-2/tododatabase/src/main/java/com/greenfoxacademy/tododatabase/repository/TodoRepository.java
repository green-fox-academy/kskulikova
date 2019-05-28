package com.greenfoxacademy.tododatabase.repository;

import com.greenfoxacademy.tododatabase.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
