package com.xworkz.collection.streamimpl.dtoimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.collection.streamimpl.dto.PlaceDto;


public class PlaceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PlaceDto place1=new PlaceDto("Humpi","hospet","vijaya nagar",true,50.0);
		PlaceDto place2=new PlaceDto("Ballari","Ballari","hanumappa nayaka",true,50.0);
		PlaceDto place3=new PlaceDto("mysour","mysour","tipu sulthan",false,150.0);
		PlaceDto place4=new PlaceDto("Badami","bagalakote","chanukya",true,120.0);
		PlaceDto place5=new PlaceDto("halebidu","halebidu","visala",true,50.0);
		PlaceDto place6=new PlaceDto("chitradurga","chitradurga","thimana nayaka",true,150.0);
		PlaceDto place7=new PlaceDto("Humpi","hospet","vijaya nagar",true,50.0);
		
		
		Collection<PlaceDto> place=new ArrayList<PlaceDto>();
		place.add(place1);
		place.add(place2);
		place.add(place3);
		place.add(place4);
		place.add(place5);
		place.add(place6);
		place.add(place7);
		
		
		Stream<PlaceDto> stream=place.stream();
		
		stream.filter(e->{
			if(e.getIsDestroyed() == false)
			{
				System.out.println("is not destroyed");
				return true;
			}
			return false;
		})
		.collect(Collectors.toList())
		.forEach(e-> System.out.println(e));
		

	}

}
