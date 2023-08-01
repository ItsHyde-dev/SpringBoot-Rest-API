package com.hyde.RestAPI.controllers;
import com.hyde.RestAPI.models.User;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

  @GetMapping("/users")
  public String users() {
    return "users";
  }

  @PostMapping("/users")
  public List<String> postUsers(@RequestBody User user) {
    System.out.println(user.toString());
    return List.of("post", "users");
  }
}

