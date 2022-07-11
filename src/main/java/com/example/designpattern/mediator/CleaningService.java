package com.example.designpattern.mediator;

public class CleaningService {

  private FrontDesk frontDesk = new FrontDesk();

  public void getTowers(int guestId, int count) {
    String roomNumber = this.frontDesk.getRoomNumber(guestId);
    System.out.println("serving towers " + count + "room number " + roomNumber);
  }
}
