package com.xworkz.collection.linkedlist.sanitizer;



import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collection.linkedlist.sanitizer.DTO.SanitaizerDTO;

public class SanitaizerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	SanitaizerDTO sanitaizer1 = new SanitaizerDTO(1,"detol",100d,"red");
	SanitaizerDTO sanitaizer2= new SanitaizerDTO(2,"Savlon",150d,"blue");
	
	SanitaizerDTO sanitaizer3= new SanitaizerDTO(3,"lifeboy",60d,"red");
	SanitaizerDTO sanitaizer4= new SanitaizerDTO(4,"sterillium",110d,"orange");
    SanitaizerDTO sanitaizer5= new SanitaizerDTO(5,"godrej",120d,"white");
    SanitaizerDTO sanitaizer6= new SanitaizerDTO(6,"Douber",170d,"red");
    SanitaizerDTO sanitaizer7= new SanitaizerDTO(7,"Multani",120d,"pink");
    SanitaizerDTO sanitaizer8= new SanitaizerDTO(8,"Corvil",90d,"yellow");
    SanitaizerDTO sanitaizer9= new SanitaizerDTO(9,"Trust",130d,"blue");
    SanitaizerDTO sanitaizer10= new SanitaizerDTO(10," DCM Shriram",200d,"white");
    SanitaizerDTO sanitaizer11=new SanitaizerDTO(11,null,20d,null);
    
    
    Collection<SanitaizerDTO> dto= new LinkedList<SanitaizerDTO>();
    dto.add(sanitaizer10);
    dto.add(sanitaizer9);
    dto.add(sanitaizer8);
    dto.add(sanitaizer7);
    dto.add(sanitaizer6);
    dto.add(sanitaizer5);
    dto.add(sanitaizer4);
    dto.add(sanitaizer3);
    dto.add(sanitaizer2);
    dto.add(sanitaizer1);
   dto.add(sanitaizer11);
    
    
   
    
    System.out.println(dto);
    
    for(SanitaizerDTO element:dto)
    {
    	if(element.price >100)
    	{
    		System.out.println("price is greater than 100 : " +element);
    	}
    }
    
    for(SanitaizerDTO element : dto)
    {
    	if(element.color == null)
    	{
    		System.out.println("null "  + element);
    	}
    	else
    	{
    		System.out.println("there is no null values given list");
    	}
    	
    	
    }
    
    
    Iterator<SanitaizerDTO> ref=dto.iterator();
    
    while(ref.hasNext()) {
    	
    	SanitaizerDTO element=ref.next();
    	
           if("red".equals(element.getColor()))
	    {
		  System.out.println(element.color);
	    }
    
    
    } 
    
    Iterator<SanitaizerDTO> removeDto= dto.iterator();
    
    while(removeDto.hasNext())
    {
    	SanitaizerDTO element=removeDto.next();
    	if(element.color == "red")
    	{
    		removeDto.remove();
    		System.out.println("removed color in red " + element);
    	}
    	
    }
   
    System.out.println(dto);
    
    SanitaizerDTO sanitaizer= dto.stream().max(Comparator.comparing(SanitaizerDTO ::getPrice)).get();
    
    System.out.println("maxum price : " +sanitaizer);
    
    SanitaizerDTO san= dto.stream().min(Comparator.comparing(SanitaizerDTO ::getPrice)).get();
    
   System.out.println("minmum price : " + san);
   
           
    }

	}


