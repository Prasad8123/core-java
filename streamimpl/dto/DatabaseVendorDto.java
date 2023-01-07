package com.xworkz.collection.streamimpl.dto;

public class DatabaseVendorDto {
	
	
	private String name;
	private String developedBy;
	private Type type;
	private Double licenseCost;

	public DatabaseVendorDto() {
		// TODO Auto-generated constructor stub
	}

	public DatabaseVendorDto(String name, String developedBy, Type type, Double licenseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.licenseCost = licenseCost;
	}

	@Override
	public String toString() {
		return "DatabaseVendorDto [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", licenseCost="
				+ licenseCost + "]";
	}
	
	  @Override
	     public int hashCode() {
		// TODO Auto-generated method stub
		 return 12;
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

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(Double licenseCost) {
		this.licenseCost = licenseCost;
	}

	
}
