package com.xworkz.collection.streamimpl.dto;

public class PlaceDto {
	
	private String name;
	private String location;
	private String builtBy;
	private Boolean isDestroyed;
	private Double visitingFees;
	
	
	public PlaceDto() {
		// TODO Auto-generated constructor stub
	}


	public PlaceDto(String name, String location, String builtBy, Boolean isDestroyed, Double visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.isDestroyed = isDestroyed;
		this.visitingFees = visitingFees;
	}


	@Override
	public String toString() {
		return "PlaceDto [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", isDestroyed="
				+ isDestroyed + ", visitingFees=" + visitingFees + "]";
	}

      @Override
     public int hashCode() {
	// TODO Auto-generated method stub
	 return 10;
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


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getBuiltBy() {
		return builtBy;
	}


	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}


	public Boolean getIsDestroyed() {
		return isDestroyed;
	}


	public void setIsDestroyed(Boolean isDestroyed) {
		this.isDestroyed = isDestroyed;
	}


	public Double getVisitingFees() {
		return visitingFees;
	}


	public void setVisitingFees(Double visitingFees) {
		this.visitingFees = visitingFees;
	}
	

}
