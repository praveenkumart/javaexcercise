package com.imrokraft.sample;

public class Phd extends Student{
	String thesis;
	long fee;
	int duration;
	
	
	public Phd(int rollno, String name, String batch, String thesis, long fee,	int duration) {
		super(rollno, name, batch);
		this.thesis = thesis;
		this.fee = fee;
		this.duration = duration;
	}
	public String getThesis() {
		return thesis;
	}
	public void setThesis(String thesis) {
		this.thesis = thesis;
	}
	public long getFee() {
		return fee;
	}
	public void setFee(long fee) {
		this.fee = fee;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Phd(int rollno, String name, String batch) {
		super(rollno, name, batch);
		// TODO Auto-generated constructor stub
	}
	
	

}
