package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.models.Log;
import com.greenfoxacademy.frontend.repository.LogRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class LogService {

  private LogRepository logRepository;

  LogService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  public void add(String endpoint, String data) {
    logRepository.save(new Log(endpoint, data));
  }

  public List<Log> findAll() {
    return logRepository.findAll();
  }

  public int count() {
    return logRepository.findAll().size();
  }
}
