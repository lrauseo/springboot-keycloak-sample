package com.lrrauseo.springbootkeycloak;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

  // @RequestMapping(path = "/v1/health", method = RequestMethod.GET, consumes = {MediaType.APPLICATION_JSON_VALUE})
  @GetMapping
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok().body("hello world");
  }
}
