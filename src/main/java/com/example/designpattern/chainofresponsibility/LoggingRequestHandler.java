package com.example.designpattern.chainofresponsibility;

public class LoggingRequestHandler extends RequestHandler{

  public LoggingRequestHandler(
      RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handler(Request request) {
    System.out.println("logging");
    super.handler(request);
  }
}
