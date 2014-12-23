package com.imrokraft.sample;

public class Undergraduate extends Student {

	public Undergraduate(int rollno, String name, String batch,long fee,int year,String department) {
		super(rollno, name, batch);
		this.department=department;
		this.year=year;
		this.fee=fee;

	}
	long  fee;
	int  year;
	String department;
	public long getFee() {
		return fee;
	}
	public void setFee(long fee) {
		this.fee = fee;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}


}
