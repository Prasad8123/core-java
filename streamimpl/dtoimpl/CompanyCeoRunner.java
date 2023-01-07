package com.xworkz.collection.streamimpl.dtoimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collection.streamimpl.dto.CompanyCeoDto;
import com.xworkz.collection.streamimpl.dto.DaughterDTO;

public class CompanyCeoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DaughterDTO daughter1=new DaughterDTO("lakshimi",64764334f,25,false,true);
		DaughterDTO daughter2=new DaughterDTO("saraswathi",87648944334f,28,true,true);
		DaughterDTO daughter3=new DaughterDTO("parvathi",64760834f,26,false,true);
		DaughterDTO daughter4=new DaughterDTO("usha",857464334f,30,true,false);
		DaughterDTO daughter5=new DaughterDTO("getha",6476847854f,23,false,false);
		
		
		Collection<CompanyCeoDto> ceo=new ArrayList<CompanyCeoDto>();
	
	    ceo.add(new CompanyCeoDto("Prasad","tcs",50,"india","Engineering","no",daughter1));
		ceo.add(new CompanyCeoDto("sunil","imposys",49,"india","Engineering","no",daughter2));
		ceo.add(new CompanyCeoDto("naveen","infosys",64,"india","Engineering","no",daughter3));
		ceo.add(new CompanyCeoDto("hemanth","cgi",47,"india","Engineering","yes",daughter4));
		ceo.add(new CompanyCeoDto("vinit","soft tech",35,"india","Engineering","no",daughter5));
		
		
		ceo.stream().collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		ceo.stream().map(e->e.getDaughterDto().getName()).collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		System.out.println(System.lineSeparator());
		ceo.stream().filter(e->e.getAge() >49).collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		ceo.stream().forEach(e->System.out.println("Father age : " + e.getAge() +" "+ "Daughter Age : " +e.getDaughterDto().getAge()));
 
	}

}
