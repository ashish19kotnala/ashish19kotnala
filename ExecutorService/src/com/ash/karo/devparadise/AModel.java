package com.ash.karo.devparadise;

public class AModel {

	private String id;
	private String location;
	
	public AModel(String id, String location) {
		this.id = id;
		this.location = location;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
}
