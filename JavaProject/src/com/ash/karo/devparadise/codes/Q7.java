package com.ash.karo.devparadise.codes;

import java.util.LinkedList;
import java.util.Queue;

public class Q7 {

	public static void main(String[] args) throws InterruptedException {
		Q7 q = new Q7();
		q.show('a');
		q.show('a',10);
	}

	void show( char a) {
		System.out.println(a);
	}
	
	void show(char a, int num) {
		System.out.println(a + "" + num);
	}
}
