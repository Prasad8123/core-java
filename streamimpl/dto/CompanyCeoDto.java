package com.xworkz.collection.streamimpl.dto;

public class CompanyCeoDto {
	
	
	private String name;
	private String company;
	private Integer age;
	private String country;
	private String qualification;
	private String married;
	
	private DaughterDTO daughterDto;

	public CompanyCeoDto() {
		// TODO Auto-generated constructor stub
	}



	public CompanyCeoDto(String name, String company, Integer age, String country, String qualification,
			String married, DaughterDTO daughterDto) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.qualification = qualification;
		this.married = married;
		this.daughterDto=daughterDto;
	}



	@Override
	public String toString() {
		return "CompanyCeoDto [name=" + name + ", company=" + company + ", age=" + age + ", country=" + country
				+ ", qualification=" + qualification + ", married=" + married + " ,daughterDto =" +daughterDto+ "]";
	}

	  @Override
	     public int hashCode() {
		// TODO Auto-generated method stub
		 return 14;
	     }
		
	      
	      @Override
	    public boolean equals(Object obj) {
	    	if(obj !=null)
	    	{
	    		if(obj instanceof PlaceDto)
	    		{
	    			PlaceDto dto=(PlaceDto)obj;
	    			if(dto.getName().equals(this.name))
	    			{
	    				return true;
	    			}
	    		}
	    	}
	    	return false;
	    }



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getQualification() {
		return qualification;
	}



	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	public String getMarried() {
		return married;
	}



	public void setMarried(String married) {
		this.married = married;
	}
	
	public DaughterDTO getDaughterDto()
	{
		return daughterDto;
	}
	
	public void setDaughterDto(DaughterDTO daughterDto)
	{
		this.daughterDto=daughterDto;
	}
	

}
