package com.lrrauseo.springbootkeycloak;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @GetMapping
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok().body("hello world");
  }
}
