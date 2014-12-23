package com.imrokraft.sample;

public class Postgraduate extends Student {
	long fee;
	String department,specialised_topic;
	
public Postgraduate(int rollno, String name, String batch,long fee,String department,String specialised_topic) {
		super(rollno, name, batch);
		this.fee=fee;
		this.department=department;
		this.specialised_topic=specialised_topic;
	}
public long getFee() {
	return fee;
}
public void setFee(long fee) {
	this.fee = fee;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getSpecialised_topic() {
	return specialised_topic;
}
public void setSpecialised_topic(String specialised_topic) {
	this.specialised_topic = specialised_topic;
}




}
