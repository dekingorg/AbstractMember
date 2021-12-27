package org.deking.member.pojo;

import java.io.Serializable;

public class Location implements Serializable,Cloneable{
	public static final Location INSTANCE;
	static {
		INSTANCE=new Location();  
	}
	@Override
	public Location clone() throws CloneNotSupportedException {
	    return (Location)super.clone();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 5713879168536718595L;
	String province,city,country;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	} 
}