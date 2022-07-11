package com.example.designpattern.facade;

import java.util.Properties;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import javax.mail.Session;

@RequiredArgsConstructor
public class EmailSender {

  private final EmailSetting emailSetting;

  public void sendEmail(EmailMessage emailMessage) {
    Properties properties = System.getProperties();
    properties.setProperty("mail.smtp.host", emailSetting.getHost());

    Session session = Session.getDefaultInstance(properties);

    try {
      MimeMessage mimeMessage = new MimeMessage(session);
      mimeMessage.setFrom(new InternetAddress(emailMessage.getForm()));
      mimeMessage.addRecipient(RecipientType.TO, new InternetAddress(emailMessage.getTo()));
      mimeMessage.setSubject(emailMessage.getSubject());
      mimeMessage.setText(emailMessage.getText());

      Transport.send(mimeMessage);
    } catch (MessagingException e) {
      e.printStackTrace();
    }
  }
}
