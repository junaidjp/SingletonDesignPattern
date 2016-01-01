package com.willcode4coffee.singleton;

public class CreditCardClass {
	
	
private static CreditCardClass creditcardClassInstance = null;
	
	protected CreditCardClass() { 
		

		
		
		
		
	}

	
	
	public static CreditCardClass getInstance() { 
		
		if (creditcardClassInstance == null) { 
			
			creditcardClassInstance = new CreditCardClass();
		}
		return creditcardClassInstance;
		
	}

}
