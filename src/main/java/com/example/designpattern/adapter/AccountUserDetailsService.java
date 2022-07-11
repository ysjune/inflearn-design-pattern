package com.example.designpattern.adapter;

import com.example.designpattern.adapter.security.UserDetails;
import com.example.designpattern.adapter.security.UserDetailsService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetailsService implements UserDetailsService {

  private final AccountService accountService;

  @Override
  public UserDetails loadUser(String username) {
    Account account = accountService.findAccountByUsername(username);
    return new AccountUserDetails(account);
  }
}
