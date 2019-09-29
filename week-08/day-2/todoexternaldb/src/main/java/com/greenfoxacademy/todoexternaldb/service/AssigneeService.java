package com.greenfoxacademy.todoexternaldb.service;

import com.greenfoxacademy.todoexternaldb.model.Assignee;
import com.greenfoxacademy.todoexternaldb.repository.AssigneeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AssigneeService implements IAssigneeService {

  private AssigneeRepository assigneeRepository;

  AssigneeService(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  public List<Assignee> findAllAssignees() {
    List<Assignee> authors = new ArrayList<>();
    assigneeRepository.findAll().forEach(author -> authors.add(author));
    return authors;
  }

  public void editAssignee(long id, String name) {
    Assignee assignee = assigneeRepository.findById(id).get();
    assignee.setName(name);
    assigneeRepository.save(assignee);
  }

  public Assignee getAssignee(long id) {
    return assigneeRepository.findById(id).get();
  }

  @Override
  public Assignee findAssigneeByName(String name) {
    List<Assignee> assignees = findAllAssignees();
      return assignees.stream().filter(a -> a.getName().equals(name)).findFirst().orElse(null);

  }

  public void saveAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  public void deleteAssignee(Long id) {
    assigneeRepository.delete(assigneeRepository.findById(id).get());
  }
}
