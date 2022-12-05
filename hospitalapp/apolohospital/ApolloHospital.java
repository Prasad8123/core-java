package com.xworkz.hospitalapp.apolohospital;



import com.xworkz.hospitalapp.constent.Gender;
import com.xworkz.hospitalapp.hopital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospital extends Hospital {
	
	// one to many
	
	public Patient[] patients;
	int index;
	
	public ApolloHospital()
	{
		
	}
	public ApolloHospital(int size)
	 
	{
		patients = new Patient[size];
		
		
	}
	
	public boolean addPatients(Patient patient)
	{
		System.out.println("inside addpatient method");
		boolean isPatientAdded = false;
		if(patient !=null )
		{
			System.out.println("patient details are registered successfully..");
		     patients[index] = patient;
			isPatientAdded = true;
			index++;
		}
		
		System.out.println("end addpatient method");
		return isPatientAdded;
		
	}
	
	public void getAllPAtients()
	{
		System.out.println("List the patients are ");
		
		for (int i = 0; i < patients.length; i++) {
			
			
			System.out.println(patients[i].getPatientName() + " " +patients[i].getAge() + " " +patients[i].getAddress() + " "  +patients[i].getGender());
			}
		
	}
               public void  getPatientByName(String patientName)
		   {
			System.out.println("inside getPatientName");
			System.out.println("no of parameter : 1 : patientName(String)");
			
			for(int i=0; i<patients.length;i++)
			{
				if(patients[i].getPatientName().equals(patientName))
				{
					System.out.println(patients[i].getPatientName() + " " +patients[i].getAge() + " " +patients[i].getAddress() 
							+ " "  +patients[i].getGender());
				}
			}
			
			//getPatientByAge(int age)
			//getPatientByGender(Gender Gender)
			//getPatientNamebyGender(Gender Gender)
			
		}
               
               public void  getPatientByAge(int age)
               {
            	   System.out.println("inside getPatientByAge");
            	   System.out.println("no of parameter :1 : pateintAge(int)");
            	   
            	   for(int i=0; i<patients.length; i++)
            	   {
            		   if(patients[i].getAge()==age)
            		   {
            			   System.out.println(patients[i].getPatientName()+ " " + patients[i].getAge()+ " " + patients[i].getAddress()+ " " +patients[i].getGender());
            		   }
            	   }
               }
               
               public void getPatientByAddress(String address)
               {
            	   System.out.println("inside patient address method");
            	   System.out.println("no of parametre :1: patient address(string address)");
            	   
            	   for(int i=0; i<patients.length; i++)
            	   {
            		  if(patients[i].getAddress().equals(address))
            		  {
            			  System.out.println(patients[i].getPatientName()+ " " + patients[i].getAge()+ " " + patients[i].getAddress()+ " " +patients[i].getGender()); 
            		  }
            	   }
               }
              
               public void getPatientByGender(Gender gender)
               {
            	   System.out.println("inside patient gender method");
            	   System.out.println("no of parametre :1: patient gender(string gender)");
            	   
            	   for(int i=0; i<patients.length; i++)
            	   {
            		  if(patients[i].getGender().equals(gender))
            		  {
            			  System.out.println(patients[i].getPatientName()+ " " + patients[i].getAge()+ " " + patients[i].getAddress()+ " " +patients[i].getGender()); 
            		  }
            	   }
               }
               
               public void getPatientNamebyGender(Gender gender)
               {
            	   System.out.println("inside patientname by gender method");
            	   System.out.println("no of parametre :1: patient gender(string gender)");
            	   
            	   for(int i=0; i<patients.length; i++)
            	   {
            		  if(patients[i].getGender().equals(gender))
            		  {
            			  System.out.println(patients[i].getPatientName()); 
            		  }
            	   }
               }

	
}
