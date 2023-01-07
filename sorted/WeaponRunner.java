package com.xworkz.collection.compartorandcomparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WeaponRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<WeaponDto> weapon=new ArrayList<WeaponDto>();
		weapon.add(new WeaponDto("ShortGun slug","India","Steel",2000,Type.shortgun));
		weapon.add(new WeaponDto("KEL-TEC ksg","United States","Steel ",8000,Type.shortgun));
		weapon.add(new WeaponDto("Armsel Striker","south Africa","Gun matel",10000,Type.shortgun));
		weapon.add(new WeaponDto("Astra A-60  ","Spain","Metal",3000,Type.handgun));
		weapon.add(new WeaponDto("Barrett M90  ","United States","Metal",40000,Type.sniperRifle));
		weapon.add(new WeaponDto("Barrett M98B  ","United States","Metal",60000,Type.sniperRifle));
		weapon.add(new WeaponDto("Modular Sniper Rifile  ","United States","Metal",80000,Type.sniperRifle));
		weapon.add(new WeaponDto("ITKK 31 VKT  ","FINLAND","Aluminum",65000,Type.machineGun));
		weapon.add(new WeaponDto("SKT 50MG  ","SINGAPORE","Metal",23000,Type.machineGun));
		weapon.add(new WeaponDto("DAEWOO K3  ","SOUTH kOREA","Metal",90000,Type.machineGun));
		
		
		System.out.println("print all weapons by price greater than");
		
		weapon.stream().filter(e->e.getPrice() >10000).sorted().collect(Collectors.toList())
		.forEach(e->System.out.println("weapon name : " +e.getName() + " " + "price : " + e.getPrice()));
		
		System.out.println(System.lineSeparator());
		
		System.out.println("print all weapons made by and made on");
		
		weapon.stream().map(e->e.getMadeBy()+"=".concat(e.getMadeOn())).sorted().collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		System.out.println("print all weapons names desc order ");
		
		weapon.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getName())).collect(Collectors.toList())
			.forEach(e->System.out.println("weapons name : " +e.getName()));
		
		System.out.println(System.lineSeparator());
		System.out.println("sort made by");
		
		weapon.stream().sorted().collect(Collectors.toList()).forEach(e->System.out.println("weapons made by : " + e.getMadeBy()));

		System.out.println(System.lineSeparator());
		System.out.println("sort made on");
		
		weapon.stream().sorted().collect(Collectors.toList())
		.forEach(e->System.out.println("weapons made on : " +e.getMadeOn()));
		
		System.out.println(System.lineSeparator());
		System.out.println("sort by price");
		weapon.stream().sorted().collect(Collectors.toList())
		.forEach(e->System.out.println("weapon name : " +e.getName() + " " + "price : " + e.getPrice()));
		
		
		System.out.println(System.lineSeparator());
		System.out.println("sort by price desc");
		
		Comparator<WeaponDto> comparator=(a1,a2)->Integer.compare(a2.getPrice(),a1.getPrice());
		weapon.stream().sorted(comparator).collect(Collectors.toList())
		.forEach(e->System.out.println("weapon name : " +e.getName() + " " + "price :" +e.getPrice()));
		
		
		System.out.println(System.lineSeparator());
		System.out.println("sort by name and made on desc");
		
		
		weapon.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getMadeOn())).collect(Collectors.toList())
		.forEach(e->System.out.println("weapon name : " +e.getName() + " " + "price :" +e.getMadeOn()));
		
		
		System.out.println(System.lineSeparator());
		System.out.println("sort by type and made by , name in desc");
		
		weapon.stream().sorted((a1,a2)->a1.getType().compareTo(a2.getType()))
		.collect(Collectors.toList()).forEach(e->System.out.println("weapon name : " + e.getName()
		+ " " + "type : "+ e.getType()+ " " +"made by : " +e.getMadeBy()));
	}

}
