package com.calc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.calc.model.CalcExpressionModel;
import com.calc.service.CalcExpressionService;
@CrossOrigin
@RestController
public class CalcExpressionController {
	@Autowired
	CalcExpressionService calcExprService;
	
	
	
	
	@PostMapping("/calcexpr")
	public String calcExpr(@RequestBody CalcExpressionModel calcExpr) {
		return calcExprService.calExpr(calcExpr.getExpr());
	}
	
	

	
}
