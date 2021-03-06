package com.greenfoxacademy.todoexternaldb.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  @ManyToOne
  private Assignee assignee;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date createDate;


  public Todo(String title) {
    this.title = title;
    done = false;
    urgent = false;
    assignee = new Assignee();
  }

  public Todo(String title, boolean done) {
    this.title = title;
    this.done = done;
    done = false;
    urgent = false;
    assignee = new Assignee();

  }

  Todo() {
    done = false;
    urgent = false;
    assignee = new Assignee();
  }


  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }
}

