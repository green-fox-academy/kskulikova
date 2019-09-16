package com.greenfoxacademy.todoexternaldb.service;

import com.greenfoxacademy.todoexternaldb.model.Assignee;
import java.util.List;

public interface IAssigneeService {
  List<Assignee> findAllAssignees();
  void editAssignee(long id, String name);
  Assignee getAssignee(long id);
  Assignee findAssigneeByName(String name);
  void saveAssignee(Assignee assignee);
  void deleteAssignee(Long id);

}
