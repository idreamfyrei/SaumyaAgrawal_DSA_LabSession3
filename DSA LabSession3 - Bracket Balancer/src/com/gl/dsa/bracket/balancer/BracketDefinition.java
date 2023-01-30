package com.gl.dsa.bracket.balancer;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BracketDefinition {
	private static Set<Brackets> predefinedBrackets;

	static {
	                    
	    predefinedBrackets = new LinkedHashSet<Brackets>();
	    
	  
	    // Round brackets 
	    predefinedBrackets.add(new Brackets('(', ')'));
	    
	    // Square Brackets 
	    predefinedBrackets.add(new Brackets('[', ']'));
	    
	    // Curly brackets 
	    predefinedBrackets.add(new Brackets('{', '}'));
	    
	    // Angle Brackets 
	    predefinedBrackets.add(new Brackets('<', '>'));
	
	}
	
public static Set<Character> getOpenBracketCharsSet(){		
	    
	    Set<Character> result = new LinkedHashSet<Character>();
	    Iterator<Brackets> iterator = predefinedBrackets.iterator();
	    
	    while (iterator.hasNext()) {
	        
	        Brackets bracket = iterator.next();
	        result.add(bracket.getOpenChar());			
	    }		
	    return result;
	}

	public static Set<Character> getCloseBracketCharsSet(){
	    
	    Set<Character> result = new LinkedHashSet<Character>();
	    Iterator<Brackets> iterator = predefinedBrackets.iterator();
	    
	    while (iterator.hasNext()) {
	        
	        Brackets bracket = iterator.next();
	        result.add(bracket.getCloseChar());			
	    }		
	    return result;
	}
	
	public static Brackets getBracket(Character closeBracket) {
        
	    for (Brackets predefinedBracket : predefinedBrackets) {
	        
	        if (predefinedBracket.getCloseChar().equals(closeBracket)) {
	            return predefinedBracket;
	        }
	    }
	    return null;
	}


}
