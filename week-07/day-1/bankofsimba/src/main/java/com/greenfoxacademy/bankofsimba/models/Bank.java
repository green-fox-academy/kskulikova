package com.greenfoxacademy.bankofsimba.models;

import java.util.ArrayList;
import java.util.List;

public class Bank {

  private List<BankAccount> list = new ArrayList<>();

  public Bank() {
    list.add(new BankAccount("Scar", 5000, "lion"));
    list.add(new BankAccount("Mufasa", 5500, "lion"));
    list.add(new BankAccount("Timon", 500, "meerkat"));
    list.add(new BankAccount("Pumbaa", 900, " warthog"));
  }

  public List<BankAccount> getList() {
    return list;
  }

}

