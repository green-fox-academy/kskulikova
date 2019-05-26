package com.greenfoxacademy.programmerfoxclub.repository;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.data.repository.CrudRepository;

public interface FoxRepository extends CrudRepository <Fox, String> {

}
