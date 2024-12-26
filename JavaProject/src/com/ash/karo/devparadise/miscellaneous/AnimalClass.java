package com.ash.karo.devparadise.miscellaneous;


public class AnimalClass 
{ 
	public static void main(String[] args) 
	{ 
		Animal a = new Cat(); 
		a.m1(null); 
		System.out.println("Animal = " + a.a);
		a.m2();
		System.out.println("--------------------");
		Dog d = new Dog(); 
		d.m1(a); 
		System.out.println("DOG = " + d.a);
		System.out.println("--------------------");
		Cat c = new Cat(); 
		c.m1(null); 
		c.m2();
		System.out.println("DOG' value called = " + c.a);
	} 
}
