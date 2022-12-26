package com.xworkz.collection.dto;

import com.xworkz.collection.dto.dtoexamples.AirportDto;

public class Airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AirportDto airport1=new AirportDto("Kempegowda","Banglore",350);
		AirportDto airport2=new AirportDto("Kempegowda","hydarabad",300);
		AirportDto airport3=new AirportDto("rajiv gandi","	delhi",450);
		AirportDto airport4=new AirportDto("chatrapathi shivaji","mumbai",400);
		AirportDto airport5=new AirportDto("thiruvendram","thiruvendram",350);
		
		boolean result=airport1.getName().equals(airport2.getName());
		System.out.println(result);
		
		boolean result1=airport1.getName().equals(airport3.getName());
		System.out.println(result1);
		
		boolean r1=airport1.getNoOfPlanes().equals(airport5.getNoOfPlanes());
		System.out.println(r1);
		
		boolean r2=airport1.getNoOfPlanes().equals(airport4.getNoOfPlanes());
		System.out.println(r2);
		
		
		

	}

}
