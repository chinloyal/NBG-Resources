package models;

import java.io.Serializable;

public class Photo implements Serializable {
	
	private int id;
	private String name;
	public static final String DEFAULT = "default.jpg";
	
	public Photo() {
		id = 0;
		name = DEFAULT;
	}
	
	
	
	public Photo(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
