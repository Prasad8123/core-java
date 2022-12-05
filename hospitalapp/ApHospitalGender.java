package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.apolohospital.ApolloHospital;
import com.xworkz.hospitalapp.constent.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public class ApHospitalGender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the size");
		int size =sc.nextInt();
		
		ApolloHospital hospital = new ApolloHospital(size);
		
		
		
		for(int i=0; i<size; i++)
		{
			
		Patient patient= new Patient();
		
		System.out.println("Enter patient name");
		patient.setPatientName(sc.next());
		
		System.out.println("Enter Patient age");
	       patient.setAge(sc.nextInt());
		
		System.out.println("Enter patient address");
		patient.setAddress(sc.next());
		

		System.out.println("Enter patient gender");
		patient.setGender( Gender.valueOf(sc.next()));
		
	
		hospital.addPatients(patient);
		
		}
		
		System.out.println("enter the pateient gender");
	     Gender gender = Gender.valueOf(sc.next());
	    // hospital.getPatientByGender(gender);
	     hospital.getPatientNamebyGender(gender);
	      sc.close();

	}

}
