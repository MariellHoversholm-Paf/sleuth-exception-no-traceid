package com.paf.marhov.sleuth.notraceid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
  private static final Logger LOGGER = LoggerFactory.getLogger(ExampleController.class);

  @RequestMapping
  public void doNothing() {
    LOGGER.info("doNothing was called.");
  }
}
