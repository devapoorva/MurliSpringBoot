package com.murli.Manohar.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TermInsurance {
    private int age;
    @JsonAlias("annual_income")
    private double annualIncome;
    private double liabilities;
    @JsonAlias("existing_cover")
    private double existingCover;

}
