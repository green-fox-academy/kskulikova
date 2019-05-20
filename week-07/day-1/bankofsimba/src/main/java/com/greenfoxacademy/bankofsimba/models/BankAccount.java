package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private String personality;
  private boolean king;

  BankAccount() {

  }

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.personality = name.equals("Scar") ? "bad" : "good";
    this.king = name.toLowerCase().equals("mufasa");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }


  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public String getPersonality() {
    return personality;
  }

  public boolean isKing() {
    return king;
  }

  public void topUp() {
    if (this.isKing()) {
      this.balance += 100;
    } else {
      this.balance += 10;
    }
  }
}


