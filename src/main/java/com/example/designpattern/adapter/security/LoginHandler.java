package com.example.designpattern.adapter.security;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginHandler {

  private final UserDetailsService userDetailsService;

  public String login(String username, String password) {
    UserDetails userDetails = userDetailsService.loadUser(username);
    if(userDetails.getPassword().equals(password)) {
      return userDetails.getUsername();
    }
    throw new IllegalArgumentException();
  }
}
