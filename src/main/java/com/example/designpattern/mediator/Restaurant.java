package com.example.designpattern.mediator;

import java.time.LocalDateTime;

public class Restaurant {

  private FrontDesk frontDesk = new FrontDesk();

  public void reservation(int guestId, LocalDateTime dateTime) {
    String roomNumber = this.frontDesk.getRoomNumber(guestId);
    System.out.println("serving dinner at " + dateTime + "room number " + roomNumber);
  }
}
