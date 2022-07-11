package com.example.designpattern.adapter.security;

public interface UserDetailsService {

  public UserDetails loadUser(String username);
}
