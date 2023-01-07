package com.xworkz.collection.streamimpl.dtoimpl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collection.streamimpl.dto.ApplicationDto;

public class ApplicationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationDto aplication1=new ApplicationDto("eclipse",11.5,true,"eclipse",0.0);
		ApplicationDto aplication2=new ApplicationDto("Turbo c++",18.5,true,"Turbo",0.0);
		ApplicationDto aplication3=new ApplicationDto("intelj idea",11.7,true,"intel",0.0);
		ApplicationDto aplication4=new ApplicationDto("MS Office",12.5,false,"microsoft",500.0);
		ApplicationDto aplication5=new ApplicationDto("MS Office12",12.5,false,"ms",500.0);
		ApplicationDto aplication6=new ApplicationDto("MS Office20019",2.5,false,"micro",500.0);
		ApplicationDto aplication7=new ApplicationDto("Pytan",11.5,true,"pytan",0.0);
		
		
		Collection<ApplicationDto> app=new LinkedList<ApplicationDto>();
		app.add(aplication1);
		app.add(aplication2);
		app.add(aplication3);
		app.add(aplication4);
		app.add(aplication5);
		app.add(aplication6);
		app.add(aplication7);
		
		
		app.stream().filter(e->
		e.getFree() !=true && e.getDevelopedBy()=="microsoft" && e.getVersion() >12)
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		
		
		System.out.println("All aplication........");
		app.stream().forEach(e->System.out.println(e));
		
		
		

	}

}
