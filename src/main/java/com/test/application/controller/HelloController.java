package com.test.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping(path = "/test")
  public String testMapping(@RequestParam String name) {
    return String.format("Hello, %s", name);
  }
}
