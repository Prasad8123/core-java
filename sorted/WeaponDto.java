package com.xworkz.collection.compartorandcomparable;

public class WeaponDto implements Comparable<WeaponDto>{
	
	private String name;
	private String madeBy;
	private String madeOn;
	private Integer price;
	private Type type;
	
	public WeaponDto() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDto(String name, String madeBy, String madeOn, Integer price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDto [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj !=null)
		{
			if(obj instanceof WeaponDto)
			{
				WeaponDto dto=(WeaponDto)obj;
				if(dto.getName().equals(this.name))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(WeaponDto o)
	{
		return this.name.compareTo(o.name);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(String madeOn) {
		this.madeOn = madeOn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	

}
