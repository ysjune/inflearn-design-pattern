package com.example.designpattern.factorymethod.example;

import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {

  public static void main(String[] args) {
    System.out.println(Calendar.getInstance().getClass());
    System.out.println(Calendar.getInstance(Locale.FRANCE).getClass());
    System.out.println(Calendar.getInstance(Locale.FRENCH).getClass());
  }
}
