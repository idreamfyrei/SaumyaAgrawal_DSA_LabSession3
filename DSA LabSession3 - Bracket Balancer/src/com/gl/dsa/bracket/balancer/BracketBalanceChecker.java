package com.gl.dsa.bracket.balancer;

import java.util.Set;
import java.util.Stack;


public class BracketBalanceChecker {

	private String expression;	
	private Result result;
	
	public BracketBalanceChecker(String expression) {
		
		this.expression = expression;				
		this.result = new Result(expression);
	}
	
	public Result check() {
		
		Stack<Character> stack = new Stack<Character>();
		
		Set<Character> openBracketsSet 
	    	= BracketDefinition.getOpenBracketCharsSet();
		
		Set<Character> closeBracketsSet 
		    = BracketDefinition.getCloseBracketCharsSet();
	
	
		for (int index = 0; index < expression.length(); index ++) {
		    
		    char aChar = expression.charAt(index);
	
			if (openBracketsSet.contains(aChar)) {
				
				stack.push(aChar);
				
		    }else if (closeBracketsSet.contains(aChar)) {
		    	
		    	Brackets bracketObj = BracketDefinition.getBracket(aChar);

		    	Character openCharFromStack = stack.pop();

		    	if (openCharFromStack.equals(bracketObj.getOpenChar())) {
		    	    
		    	    // Match
		    	    continue;
		    	}else {
		    	    break;
		    	}

		    }else{
		    	System.out.println("Invalid character encountered "
		    	        + "during traversal is " + aChar);
		    	result.setBalanced(false);
		    	break;
		    	
		    }
		}
		
		boolean empty = stack.isEmpty();

		if (empty) {
		    result.setBalanced(true);
		}else {
		    result.setBalanced(false);
		}

		return result;
	}


}
