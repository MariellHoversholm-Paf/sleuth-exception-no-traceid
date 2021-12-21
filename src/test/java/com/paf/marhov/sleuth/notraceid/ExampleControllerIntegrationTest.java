package com.paf.marhov.sleuth.notraceid;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class ExampleControllerIntegrationTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  void controllerRequest() throws Exception {
    // This only shows that the log from a controller _does_ have a trace id.
    this.mockMvc.perform(MockMvcRequestBuilders.get("/"))
        .andExpect(MockMvcResultMatchers.status().isOk());

    // And now to ensure the scheduled method ran.
    Thread.sleep(TimeUnit.SECONDS.toMillis(2L));
  }
}
