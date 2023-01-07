package com.xworkz.collection.compartorandcomparable;




public class ApplicationDTO implements Comparable<ApplicationDTO> {
	

	
	private String name;
	private int version;
	private Boolean free;
	private String developedBy;
	private double price;
	

	public ApplicationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ApplicationDTO(String name, int version, boolean free, String developedBy, Double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}


	@Override
	public String toString() {
		return "ApplicationDto [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}
	
	  @Override
	     public int hashCode() {
		// TODO Auto-generated method stub
		 return 11;
	     }
		
	      
	      @Override
	    public boolean equals(Object obj) {
	    	if(obj !=null)
	    	{
	    		if(obj instanceof ApplicationDTO)
	    		{
	    			ApplicationDTO dto=(ApplicationDTO)obj;
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


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public boolean getFree() {
		return free;
	}


	public void setFree(boolean free) {
		this.free = free;
	}


	public String getDevelopedBy() {
		return developedBy;
	}


	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public int compareTo(ApplicationDTO o) {
		
		return this.name.compareTo(o.name) ;
		
	}
	

}
