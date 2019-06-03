package com.greenfoxacademy.frontend.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SithText extends Message {

  private String sith_text;

  public SithText(String input) {
    sith_text = transformToSith(input);
  }

  String transformToSith(String input) {
    StringBuilder result = new StringBuilder();
    List<String> words;
    List<String> sentences;
    List<String> punctuation = new ArrayList<>();
    for (String s : input.split("")) {
      if (s.equals(".") || s.equals("?") || s.equals("!")) {
        punctuation.add(s);
      }
    }

    sentences = Arrays.stream(input.split("[.?!]+")).collect(Collectors.toList());
    for (int i = 0; i < sentences.size(); i++) {
      String s = sentences.get(i);
      words = Arrays.stream(s.trim().toLowerCase().split(" ")).collect(Collectors.toList());
      for (int n = 0; n < words.size() - 2; n += 2) {
        Collections.swap(words, n, n + 1);
      }
      words.set(0, Character.toUpperCase(words.get(0).charAt(0)) + words.get(0).substring(1));

      result.append(" ");
      for (int j = 0; j < words.size(); j++) {
        String word = words.get(j);
        result.append(word);
        if (j < words.size() - 1) {
          result.append(" ");
        }
      }
      result.append(punctuation.get(i));
      result.append(" ");
      result.append(getRandomSound().get(0));
      result.append(" ");
      result.append(getRandomSound().get(1));
    }
    return result.toString().trim();
  }

  public String getSith_text() {
    return sith_text;
  }

  List<String> getRandomSound() {

    List<String> mumboJumbo = Arrays.asList(new String[]{"Arrgh.", "Uhmm.", "Err.", "err.."});
    Collections.shuffle(mumboJumbo);
    return mumboJumbo;
  }
}
