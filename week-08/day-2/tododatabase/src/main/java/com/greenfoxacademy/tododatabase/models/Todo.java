package com.greenfoxacademy.tododatabase.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;


  Todo(String title) {
    this.title = title;
    done = false;
    urgent = false;
  }

  Todo() {
    done = false;
    urgent = false;
  }
}
