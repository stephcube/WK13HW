package com.promineotech.jeep.controller.support;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import lombok.Getter;

public class BaseTest {
  @org.springframework.boot.web.server.LocalServerPort
  private int serverPort; 
  
  @Autowired
  @Getter
  private TestRestTemplate restTemplate;
  
  protected String getBaseUri() {
    return String.format("http://localhost:%d/jeeps", serverPort);
  }
}
