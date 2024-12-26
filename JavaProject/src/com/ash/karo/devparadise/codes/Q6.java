package com.ash.karo.devparadise.codes;

public class Q6 {

	public static void main(String[] args) throws InterruptedException {
		
		Father f;
		Child c;
		Grandson.m(null,null);
		Grandson.m(f=null,c=null);
		Grandson.m(c,f);
	}

	
	
}
 class Father {}

 class Child extends Father{}

 class Grandson extends Child {
	
	static void m(Father x, Father y) {
		System.out.println("1");
	}
	
	static void m(Father x, Child y) {
		System.out.println("2");
	}
	
	static void m(Child x, Father y) {
		System.out.println("3");
	}
	
	static void m(Child x, Child y) {
		System.out.println("4");
	}
}