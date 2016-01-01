package com.willcode4coffee.singleton;

public class SingletonDemo {
	
	public static void main(String args[]) { 
		
		CreditCardClass creditCardClass = CreditCardClass.getInstance();
		System.out.println("You just loaded the creditcardClass through Singleton " + creditCardClass);
		
		
		
		
	}

}
