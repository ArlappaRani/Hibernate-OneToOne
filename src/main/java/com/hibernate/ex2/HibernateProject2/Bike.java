package com.hibernate.ex2.HibernateProject2;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike {
	@Id
 int bikeID;
 String brand;
 String color;
 @OneToOne
 Student2 st;
public Bike() {
	super();
	// TODO Auto-generated constructor stub
}
public Bike(int bikeID, String brand, String color,Student2 st) {
	super();
	this.bikeID = bikeID;
	this.brand = brand;
	this.color = color;
	this.st=st;
}
public int getBikeID() {
	return bikeID;
}
public void setBikeID(int bikeID) {
	this.bikeID = bikeID;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Student2 getSt() {
	return st;
}
public void setSt(Student2 st) {
	this.st = st;
}



}
