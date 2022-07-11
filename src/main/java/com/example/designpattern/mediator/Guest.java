package com.example.designpattern.mediator;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Guest {

  private FrontDesk frontDesk = new FrontDesk();
  private int id;

  public void getTowers(int count) {
    this.frontDesk.getTowers(this, count);
  }

  public void dinner(LocalDateTime dateTime) {
    this.frontDesk.dinner(this, dateTime);
  }
}
