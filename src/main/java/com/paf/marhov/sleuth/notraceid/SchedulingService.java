package com.paf.marhov.sleuth.notraceid;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulingService {
  @Scheduled(fixedRate = 10_000L)
  public void scheduledException() {
    throw new RuntimeException("Scheduled exception");
  }
}
