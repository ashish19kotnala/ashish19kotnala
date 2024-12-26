package com.ash.karo.devparadise.codes;

import java.util.LinkedList;
import java.util.Queue;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		Queue q = new LinkedList();
		q.add("network");
		q.add("network2");
		q.add("network3");
		show(q);
	}

	public static void show(Queue q) {
		q.add(new Integer(11));
		while(!q.isEmpty()) {
			System.out.println(q.poll() + " ");
		}
	}
}
