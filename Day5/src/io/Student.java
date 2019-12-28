package io;

import java.io.Serializable;

public class Student implements Serializable {
	
	private String name;
	private int rollNumber;
	public Student(String string, int i) {
		// TODO Auto-generated constructor stub
		name =string;
		rollNumber = i;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

}
