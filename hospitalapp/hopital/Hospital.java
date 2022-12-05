package com.xworkz.hospitalapp.hopital;

import com.xworkz.hospitalapp.patient.Patient;

public class Hospital {	
	
public Patient patient;
	
	public boolean isEmergency = true;
	public boolean isTreatmentRequired = true;
	public boolean admit(Patient patient)
	
	{
		boolean isAdmitted = false;
		if(isTreatmentRequired  == true)
		{
			
		if(isEmergency == true)
			
		{
			this.patient = patient;
			patient.displayInfo();
			System.out.println(" patient  can be allowed in ICU ");
		}
		else
		{
			this.patient = patient;
			patient.displayInfo();
			System.out.println("Patient can be allowed in genral ward ");
		}	
	}
		else
		{
			
			System.out.println(" treatment is not required go to home...");
		}
		return isAdmitted;
}
}
