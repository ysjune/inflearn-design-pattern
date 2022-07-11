package com.example.designpattern.adapter;

import com.example.designpattern.adapter.security.LoginHandler;
import com.example.designpattern.adapter.security.UserDetailsService;

public class App {

  public static void main(String[] args) {
    AccountService accountService = new AccountService();
    UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
    LoginHandler loginHandler = new LoginHandler(userDetailsService);
    String login = loginHandler.login("snack", "snack");
    System.out.println(login);
  }
}
