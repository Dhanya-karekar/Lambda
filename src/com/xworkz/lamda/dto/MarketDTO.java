package com.xworkz.lamda.dto;

import java.io.Serializable;

public class MarketDTO implements Serializable {
	private String name;
	private String location;
	private int noOfShops;
	private String type;

	MarketDTO() {
		System.out.println("default");
	}

	public MarketDTO(String name, String location, int noOfShops, String type) {
		super();
		this.name = name;
		this.location = location;
		this.noOfShops = noOfShops;
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfShops;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketDTO other = (MarketDTO) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfShops != other.noOfShops)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MarketDTO [name=" + name + ", location=" + location + ", noOfShops=" + noOfShops + ", type=" + type
				+ "]";
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

	public int getNoOfShops() {
		return noOfShops;
	}

	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
