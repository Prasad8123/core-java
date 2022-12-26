package com.xworkz.collection.dto.dtoexamples;

public class GameDto {
	
	private String name;
	public String type;
	private Integer noOfPlayers;
	
	
	public GameDto() {
		// TODO Auto-generated constructor stub
	}


	public GameDto(String name, String type, Integer noOfPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.noOfPlayers = noOfPlayers;
	}


	@Override
	public String toString() {
		return "GameDto [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + "]";
	}
	
	@Override
	public boolean equals(Object ref)
	{
		if(ref != null)
		{
			if(ref instanceof GameDto)
			{
				GameDto dto=(GameDto)ref;
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Integer getNoOfPlayers() {
		return noOfPlayers;
	}


	public void setNoOfPlayers(Integer noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	
	
	

}
