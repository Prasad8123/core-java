package com.xworkz.collection.dto;

import com.xworkz.collection.dto.dtoexamples.GameDto;

public class games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GameDto game1=new GameDto("kabadi", "indore", 14);
		GameDto game2=new GameDto("koko", "indore", 14);
		GameDto game3=new GameDto("kabadi", "outdore", 12);
		GameDto game4=new GameDto("cricate", "outdore", 15);
		GameDto game5=new GameDto("basketball", "indore", 16);
		
		
         Boolean result=game1.type.equals(game2.type);
		
		System.out.println("result :- " + result);
		
		Boolean sol=game1.getName().equals(game2.getName());
			System.out.println("resuit : - " + sol);
			

			Boolean sol1=game3.getNoOfPlayers().equals(game4.getNoOfPlayers());
				System.out.println("resuit : - " + sol1);
				
	    Boolean result1=game1.getType().contains(game5.getType());
	    System.out.println(result1);
	}

}
