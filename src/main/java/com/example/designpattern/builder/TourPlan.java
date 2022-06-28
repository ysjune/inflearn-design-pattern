package com.example.designpattern.builder;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourPlan {

  private String title;
  private int nights;
  private int days;
  private LocalDate startDate;
  private String whereToStay;
  private List<DetailPlan> plans;
}
