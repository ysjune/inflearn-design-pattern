package com.example.designpattern.chainofresponsibility;

public class PrintRequestHandler extends RequestHandler{

  public PrintRequestHandler(
      RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handler(Request request) {
    System.out.println(request.getBody());
    super.handler(request);
  }
}
