package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.Tricks;
import com.greenfoxacademy.programmerfoxclub.repository.FoxRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;

@Service
public class FoxServiceCRUD implements FoxServiceable {

  private FoxRepository foxRepository;
  private List<String> tricks = Stream.of(Tricks.values())
      .map(Tricks::getName)
      .collect(Collectors.toList());

  private List<String> food = Stream.of(Food.values())
      .map(Food::getName)
      .collect(Collectors.toList());
  private List<String> drink = Stream.of(Drink.values())
      .map(Drink::getName)
      .collect(Collectors.toList());

  FoxServiceCRUD(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  @Override
  public List<Fox> getFoxList() {
    List<Fox> foxes = new ArrayList<>();
    foxRepository.findAll().forEach(foxes::add);
    return foxes;
  }

  @Override
  public Fox getFox(String name) {
    return foxRepository.findById(name).orElse(null);
  }

  @Override
  public boolean checkFox(String name) {
    return foxRepository.existsById(name);
  }

  @Override
  public String getMessage(String name) {
    String message = "";
    if (!checkFox(name)) {
      message = "You have provided a name that has not been used before, add it as a new one!";
    }
    return message;
  }

  @Override
  public void add(String name) {
    foxRepository.save(new Fox(name));
  }

  @Override
  public void addOrUpdate(Fox fox) {
    foxRepository.save(fox);
  }

  @Override
  public List<String> getTricks() {
    return tricks;
  }

  @Override
  public List<String> getFood() {
    return food;
  }

  @Override
  public List<String> getDrink() {
    return drink;
  }
}
