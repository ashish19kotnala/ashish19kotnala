package com.ash.karo.devparadise.codes;

public class Q4 {

	public static void main(String[] args) throws InterruptedException {
		
		A aa1 = new A(); A aa2 = new A(); 
		
		aa1.predict();
		aa2.compute();
		aa1.enumerate();
		aa2.enumerate();
		
	}
	
	public static class A { 
		boolean count;		
		
		void predict () {
			count = true;
		}
		
		void compute () {
			count = false;
		}
		
		void enumerate () {
			System.out.println(count);
		}
	}
	
	
}

