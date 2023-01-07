package com.xworkz.collection.streamimpl.dto;

public class DaughterDTO extends CompanyCeoDto{

	
	private String name;
	private Float mobile;
	private Integer age;
	private Boolean isCommitted;
	private Boolean  isalive;
	
	public DaughterDTO() {
		// TODO Auto-generated constructor stub
	}

	public DaughterDTO(String name, Float mobile, Integer age, Boolean isCommitted, Boolean isalive) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.isCommitted = isCommitted;
		this.isalive = isalive;
	}

	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", mobile=" + mobile + ", age=" + age + ", isCommitted=" + isCommitted
				+ ", isalive=" + isalive + "]";
	}

	
	  @Override
	     public int hashCode() {
		// TODO Auto-generated method stub
		 return 15;
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

	public Float getMobile() {
		return mobile;
	}

	public void setMobile(Float mobile) {
		this.mobile = mobile;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getIsCommitted() {
		return isCommitted;
	}

	public void setIsCommitted(Boolean isCommitted) {
		this.isCommitted = isCommitted;
	}

	public Boolean getIsalive() {
		return isalive;
	}

	public void setIsalive(Boolean isalive) {
		this.isalive = isalive;
	}
	
	

}
