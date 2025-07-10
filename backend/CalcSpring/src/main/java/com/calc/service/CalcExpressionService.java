package com.calc.service;
import org.springframework.stereotype.Service;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

@Service
public class CalcExpressionService {

	
	
	
	public String calExpr(String expr) {
		if(!expr.matches("[0-9+\\-*/().^\\s]+")) {
			return "INVALID CHARECTER INPUT";
		}		
			try {
				Expression expression = new ExpressionBuilder(expr).build();
				double result = expression.evaluate();
				return String.valueOf(result);
			}
			catch(Exception e){
				return "Invalid math expression";
			}
	}
	
	
	
	
	

}
