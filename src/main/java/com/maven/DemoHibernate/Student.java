package com.maven.DemoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	private String adddress;
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
	public String getAdddress() {
		return adddress;
	}
	public void setAdddress(String address) {
		this.adddress = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", adddress=" + adddress + "]";
	}
	
	
	
	
}
