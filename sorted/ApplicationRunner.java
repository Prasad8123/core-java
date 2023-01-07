package com.xworkz.collection.compartorandcomparable;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationDTO aplication1=new ApplicationDTO("Eclipse",11,true,"eclipse",0.0);
		ApplicationDTO aplication2=new ApplicationDTO("Turbo c++",18,true,"Turbo",0.0);
		ApplicationDTO aplication3=new ApplicationDTO("Intelj idea",13,true,"intel",0.0);
		ApplicationDTO aplication4=new ApplicationDTO("MS Office",12,false,"microsoft",500.0);
		ApplicationDTO aplication5=new ApplicationDTO("MS Office12",16,false,"ms",500.0);
		ApplicationDTO aplication6=new ApplicationDTO("MS Office20019",2,false,"micro",500.0);
		ApplicationDTO aplication7=new ApplicationDTO("Pytan",11,true,"pytan",0.0);
		
		
		List<ApplicationDTO> app=new LinkedList<ApplicationDTO>();
		app.add(aplication1);
		app.add(aplication2);
		app.add(aplication3);
		app.add(aplication4);
		app.add(aplication5);
		app.add(aplication6);
		app.add(aplication7);
		
		
		System.out.println("sort element by asc order");
       app.stream().sorted().collect(Collectors.toList()).forEach(e->System.out.println(e));
       
     System.out.println("sort element by dec order");
      app.stream().sorted((a1,a2)->a1.getDevelopedBy().compareTo(a2.getDevelopedBy()))
      .collect(Collectors.toList()).forEach(e->System.out.println(e));
       
      System.out.println("free elemn asc if false");
      
      Comparator<ApplicationDTO> comparator=(a1,a2)->Boolean.compare(a1.getFree(),a2.getFree());
      
      app.stream().filter(e-> e.getFree() !=true).sorted(comparator).forEach(e->System.out.println(e));
      
	}

}
