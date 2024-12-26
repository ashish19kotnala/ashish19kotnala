package com.ash.karo.devparadise.codes;

public class Q1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String s1 = "abc";
		long l1 = System.identityHashCode(s1);
		s1 = null;
		System.gc();
		Thread.sleep(1000);
		String s2 = "abc";
		long l2 = System.identityHashCode(s2);
		System.out.println(l1 == l2);
	}

}
