package com.greenfoxacademy.frontend.models;

import com.greenfoxacademy.frontend.service.LogService;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class AllLogs {

  private LogService logService;
  private List<Log> logs;
  private int entry_count;


  public AllLogs(LogService logService) {
    this.logService = logService;
    logs = logService.findAll();
    entry_count = logService.count();
  }

  public LogService getLogService() {
    return logService;
  }

  public List<Log> getLogs() {
    return logs;
  }

  public int getEntry_count() {
    return entry_count;
  }
}
