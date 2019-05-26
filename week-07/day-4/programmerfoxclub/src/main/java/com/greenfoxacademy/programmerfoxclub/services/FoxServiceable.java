package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import java.util.List;

public interface FoxServiceable {

  List<Fox> getFoxList();

  Fox getFox(String name);

  boolean checkFox(String name);

  String getMessage(String name);

  void add(String name);

  void addOrUpdate(Fox fox);

  List<String> getTricks();

  List<String> getFood();

  List<String> getDrink();
}


