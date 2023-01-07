package com.xworkz.collection.lamda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public abstract class LamdaExpression implements FunctionalIntr{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Anonymous class....
		
		System.out.println("Anonymous imple......");
		Collection<String> animal= new ArrayList<String>();
		animal.add("dog");
	    animal.add("cat");
	    animal.add("hours");
	    animal.add("donkey");
	    animal.add("elephant");
	    animal.add("tigur");
	    
	    System.out.println("animal siz " + animal.size());
	    for(String str:animal)
	    {
	    	System.out.println(str);
	    }
	    
	    
	 // Functional interface
	    System.out.println("Functional impl......");
	    LamdaExpression govt= new LamdaExpression()
	    {
	    
	    	@Override
	    	public void test(int t, int y) {
	    		
	    		System.out.println("running test");
	    		System.out.println(t);
	    		System.out.println(y);
	    		
	    	}
	    };
	    
	    govt.test(12, 63);
	    
	    
	    
	    // lambda expression
	    
	    System.out.println("Lambda expression........");
	    
	    FunctionalIntr lambda =(t,y)->{
	    	System.out.println("lambda exprssion");
	    	System.out.println(t);
	    	System.out.println(y);
	    	
	    	 };
	    
	    lambda.test(14, 43);
	    
	    
	    //Consumer interface only one arguments in the abstract method on functional interface
	    
	    System.out.println("consumer interface.......");
	    Consumer<String> consumer=(e)->{
	    	System.out.println(e);
	    };
	    	
	     animal.forEach(consumer);
	}	

}

	
