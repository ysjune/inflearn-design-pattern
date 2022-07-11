package com.example.designpattern.chainofresponsibility;

public class AuthRequestHandler extends RequestHandler{

  public AuthRequestHandler(
      RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handler(Request request) {
    System.out.println("auth?");
    super.handler(request);
    System.out.println("auth end!");
  }
}
