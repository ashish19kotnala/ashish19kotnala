package com.ash.karo.devparadise.codes;

import java.util.LinkedList;
import java.util.Queue;

public class Q3 {

	public static void main(String[] args) throws InterruptedException {
		
		show(1);
		show(1,2,3);
	}

	final static void show(final int a) {
		System.out.println(a);
	}
	
	final static void show(final Integer... a) {
		System.out.println(a[0]);
	}
}
