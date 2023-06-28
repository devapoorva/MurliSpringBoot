package com.murli.Manohar.services;

import com.murli.Manohar.model.TermInsurance;
import org.springframework.stereotype.Service;

@Service
public class TermInsuranceServiceImpl implements TermInsuranceService {
    @Override
    public double insuranceCalculator(TermInsurance termInsurance) {
        int IncomeMultipier1 = 10;
        int IncomeMultiplier2 = 5;
        double totaleligiblecover = Math.max((termInsurance.getAnnualIncome()*IncomeMultipier1)-termInsurance.getExistingCover(),0);
        if(totaleligiblecover>termInsurance.getLiabilities()){
            totaleligiblecover = Math.max(termInsurance.getLiabilities()+(totaleligiblecover-termInsurance.getLiabilities())*IncomeMultiplier2-termInsurance.getExistingCover(),0);
        }
        return totaleligiblecover;
    }
}
