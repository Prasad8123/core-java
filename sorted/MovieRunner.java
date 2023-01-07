package com.xworkz.collection.compartorandcomparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class MovieRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Collection<MovieDTO> movies=new ArrayList<MovieDTO>();
		movies.add(new MovieDTO("Avathar",100,LocalDate.of(2022, 12, 16),"English",250));
		movies.add(new MovieDTO("Veda",50,LocalDate.of(2022, 12, 28),"Kannada",300));
		movies.add(new MovieDTO("Kranthi",200,LocalDate.of(2023, 2, 12),"Kannada",250));
		movies.add(new MovieDTO("Kanatahara",75,LocalDate.of(2022, 10, 20),"Kannada",200));
		movies.add(new MovieDTO("KGF2",200,LocalDate.of(2022, 6, 16),"kannada",250));

		System.out.println("movies in asc order");
		movies
		.stream()
		.sorted()
		.forEach(ref->System.out.println(ref));
		
		System.out.println("movies in desc order");
		
		movies.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getName()))
		.collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		System.out.println("movie name and local lang it will be print");
		
		movies.stream().map(e->e.getName()+"=".concat(e.getLanguage())).sorted()
		.collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		System.out.println("name and budget");
		
		movies.stream().filter(e->{
			
			if(e.getName().equals(e.getName()) && e.getBudget()==e.getBudget()) {
				return true;
				}
			return false;
			}
		).sorted().collect(Collectors.toList()).forEach(e->System.out.println("name : " +e.getName() + " " + "budget : " + e.getBudget()));
		
		
		
		
		
		
		

	}

}
