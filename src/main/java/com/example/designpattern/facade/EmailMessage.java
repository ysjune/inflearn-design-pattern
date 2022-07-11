package com.example.designpattern.facade;

import lombok.Data;

@Data
public class EmailMessage {

  private String form;
  private String to;
  private String subject;
  private String text;
}
