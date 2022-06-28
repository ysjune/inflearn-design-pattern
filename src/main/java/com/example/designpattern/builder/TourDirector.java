package com.example.designpattern.builder;

import java.time.LocalDate;

public class TourDirector {

  private TourPlanBuilder tourPlanBuilder;

  public TourDirector(TourPlanBuilder tourPlanBuilder) {
    this.tourPlanBuilder = tourPlanBuilder;
  }

  public TourPlan cancunTrip() {
    return tourPlanBuilder.title("칸쿤 여행")
        .nightsAndDays(2, 3)
        .startDate(LocalDate.now())
        .whereToStay("리조트")
        .addPlan(0, "check in")
        .addPlan(0, "dinner")
        .getPlan();
  }
}
