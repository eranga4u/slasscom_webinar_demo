package com.slasscom.demo.dto;

import java.io.Serializable;

/**
 * 
 * @author eranga
 *
 */
public class StudentDTO implements Serializable{


	private static final long serialVersionUID = 6340509709548669619L;
	
	private String id;
	private String name;
	private String address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
