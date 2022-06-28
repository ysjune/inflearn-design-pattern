package com.example.designpattern.builder;

import java.time.LocalDate;

public class App {

  public static void main(String[] args) {
    TourPlanBuilder builder = new DefaultTourBuilder();
    builder.title("칸쿤 여행")
        .nightsAndDays(2, 3)
        .startDate(LocalDate.now())
        .whereToStay("리조트")
        .addPlan(0, "check in")
        .addPlan(0, "dinner")
        .getPlan();

    TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
    TourPlan cancunTrip = tourDirector.cancunTrip();
    System.out.println(cancunTrip);

  }
}
