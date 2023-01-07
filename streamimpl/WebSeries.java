package com.xworkz.collection.streamimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class WebSeries  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Collection<String> collection=new ArrayList<String>();
        collection.add("Game of Throwns");
        collection.add("Live telicast");
        collection.add("Loki");
        collection.add("parampara");
        collection.add("money Heighst");
        collection.add("Stranger Things");
        collection.add("Dark");
        collection.add("rakan");
        
        
       
        System.out.println("Stream imple...........");
        
       Stream<String> stream=collection.stream();
        
		
		  stream.filter(element->{return element.startsWith("D") &&
		  element.endsWith("k");}) .collect(Collectors.toList())
		  .forEach(e->System.out.println(e));
		 
        
        
        System.out.println("------------------------------");
        
       
        collection.stream().filter(element->element.endsWith("t"))
        .collect(Collectors.toList())
        .forEach(e->System.out.println(e));
        

	}

}
