package com.example.designpattern.adapter;

import com.example.designpattern.adapter.security.UserDetails;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetails implements UserDetails {

  private final Account account;

  @Override
  public String getUsername() {
    return account.getName();
  }

  @Override
  public String getPassword() {
    return account.getPassword();
  }
}
