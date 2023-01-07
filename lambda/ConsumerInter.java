package com.xworkz.collection.lamda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public abstract  class ConsumerInter implements Functional1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Collection<Integer> colllection= new ArrayList<Integer>();
		colllection.add(1);
		colllection.add(138);
		colllection.add(63);
		colllection.add(562);
		
		
		Consumer<Integer> consumer=(t)->
		{
			System.out.println(1);
		};
		
		colllection.forEach((e)-> System.out.println(e));
		
		
		

	}

	
	

}
