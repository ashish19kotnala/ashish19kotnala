package com.ash.karo.devparadise.model;

public class Employee {

	private String name;
	private double salary;
	
	public Employee(String string, double i) {
		name = string;
		salary =  i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
