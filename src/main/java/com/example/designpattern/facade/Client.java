package com.example.designpattern.facade;

public class Client {

  public static void main(String[] args) {
    EmailSetting emailSetting = new EmailSetting();
    emailSetting.setHost("127.0.0.1");
    EmailSender emailSender = new EmailSender(emailSetting);
    EmailMessage emailMessage = new EmailMessage();
    emailMessage.setForm("snack");
    emailMessage.setTo("snack");
    emailMessage.setSubject("game");
    emailMessage.setText("lol");
    emailSender.sendEmail(emailMessage);
  }
}
