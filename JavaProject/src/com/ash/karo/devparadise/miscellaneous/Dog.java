package com.ash.karo.devparadise.miscellaneous;

public class Dog extends Animal
{ 
	int a = 100;
	
	@Override 
	protected void m1(Animal a)
	{ 
		System.out.println("The only dog is a pet animal."); 
	 } 
	
	@Override
	void m2()
	{ 
		System.out.println("Called DOG m2."); 
	} 
} 
