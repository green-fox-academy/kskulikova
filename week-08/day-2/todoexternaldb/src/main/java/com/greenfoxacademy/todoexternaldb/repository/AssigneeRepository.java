package com.greenfoxacademy.todoexternaldb.repository;

import com.greenfoxacademy.todoexternaldb.model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

}
