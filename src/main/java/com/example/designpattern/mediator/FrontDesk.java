package com.example.designpattern.mediator;

import java.time.LocalDateTime;

public class FrontDesk {

  private CleaningService cleaningService = new CleaningService();
  private Restaurant restaurant = new Restaurant();

  public void getTowers(Guest guest, int count) {
    cleaningService.getTowers(guest.getId(), count);
  }


  public String getRoomNumber(int guestId) {
    return "1111";
  }

  public void dinner(Guest guest, LocalDateTime dateTime) {
    restaurant.reservation(guest.getId(), dateTime);
  }
}
