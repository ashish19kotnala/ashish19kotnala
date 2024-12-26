package com.ash.karo.devparadise.codes;

public class Q8 {

	public static void main(String[] args) throws InterruptedException {
		
		class3 q = new class3();
		System.out.println(q.max(13, 29));
	}

	
	
}
 class class1 {
	 int max(int x, int y) {
		if(x>y) {
			return x;
		} else {
			return y;
		}
	 }
	 
 }

 class class2 extends class1{
	 int max(int x, int y) { 
		return super.max(y, x)-10;
	 }
 }

 class class3 extends class2 {
	
	 int max(int x, int y) {
			return super.max(x +10, y+10);
		 }
}