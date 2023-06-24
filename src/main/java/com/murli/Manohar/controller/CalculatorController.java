package com.murli.Manohar.controller;

import com.murli.Manohar.model.TermInsurance;
import com.murli.Manohar.services.TermInsuranceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1")
public class CalculatorController {

    private final TermInsuranceService termInsuranceService;

    public CalculatorController(TermInsuranceService termInsuranceService) {
        this.termInsuranceService = termInsuranceService;
    }

    @PostMapping(path = "term-insurance")
    public @ResponseBody ResponseEntity<Map<String,Object>> termInsurance(
            @RequestBody TermInsurance termInsurance
            ){
        Map<String,Object> response = new HashMap<>();
        response.put("message","Murli Manohar");
        response.put("result",termInsuranceService.insuranceCalculator(termInsurance));
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
