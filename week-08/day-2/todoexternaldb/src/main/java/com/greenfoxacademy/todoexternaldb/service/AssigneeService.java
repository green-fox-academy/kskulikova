package com.greenfoxacademy.todoexternaldb.service;

import com.greenfoxacademy.todoexternaldb.model.Assignee;
import com.greenfoxacademy.todoexternaldb.model.Todo;
import com.greenfoxacademy.todoexternaldb.repository.AssigneeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AssigneeService {

  private AssigneeRepository assigneeRepository;

  AssigneeService(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  public List<Assignee> findAll() {
    List<Assignee> authors = new ArrayList<>();
    assigneeRepository.findAll().forEach(author -> authors.add(author));
    return authors;
  }

  public void edit(long id, String name) {
    Assignee assignee = assigneeRepository.findById(id).get();
    assignee.setName(name);
    assigneeRepository.save(assignee);
  }

  public Assignee getAssignee (long id) {
    return assigneeRepository.findById(id).get();
  }

  public void save(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  public void delete(Long id) {
    assigneeRepository.delete(assigneeRepository.findById(id).get());
  }
}
