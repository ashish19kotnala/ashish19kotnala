package com.ash.karo.devparadise.threading;

import java.util.concurrent.atomic.AtomicInteger;

public class SyncTwoThreads {
	
	private static AtomicInteger atom = new AtomicInteger(0);
	
	private static Object syncher = new Object ();
	
	private static char character = 'a';

	public static void main(String[] args) throws InterruptedException {

		
		
	// Solution 1
		/*
		Runnable run1 = () -> {
			//System.out.println("Thread Name = " + Thread.currentThread().getName());
			for(char i='a';i<='z';i++) {
			//System.out.println("ATOM R1 is " + atom.get());
				if(atom.compareAndSet(0,1)) {
					synchronized (syncher) {
						syncher.notifyAll();
						//System.out.print("char = " + i+",");
						System.out.print(i+",");
						try {
							syncher.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					//Thread.currentThread().wait();
					//syncher.wait();
					}
				} else {
					atom.decrementAndGet();
					syncher.notifyAll();
				}
	    }};
		
	    //run1.run();
	    Thread thread = new Thread(run1);
	    
	    
	    Runnable run2 = () -> {
	    	//System.out.println();
	    	//System.out.println();
	    	//System.out.println("Thread Name = " + Thread.currentThread().getName());
	    	//if(atom.compareAndSet(0,1)) {
			for(int i=1;i<=27;i++) {
			System.out.print(i+",");
				if(atom.compareAndSet(1,0)) {
					synchronized (syncher) {
						syncher.notifyAll();
						//System.out.print("int = " + i+",");
						//Thread.currentThread().wait();
						try {
							syncher.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//syncher.wait();
					}
				} else {
					atom.decrementAndGet();
					//Thread.currentThread().notify();
					syncher.notifyAll();
				}
				//System.out.println("ATOM R2 is " + atom.get()); 
				//syncher.wait();
			}
	    //}
			};
		
	    //run2.run();
	    
	    Thread thread2 = new Thread(run2);
	    
	    thread.start();
	    try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    thread2.start();
	    
	    */
	    
		// Solution 2 Not working
	    
	    Runnable run3 = () -> {
			//System.out.println("Thread Name = " + Thread.currentThread().getName());
			for(int i=1;i<=26;i++) {
			//System.out.println("ATOM R1 is " + atom.get());
				if(atom.compareAndSet(0,1)) {
						//System.out.print("char = " + i+",");
						System.out.print(character++ +",");
					//Thread.currentThread().wait();
					//syncher.wait();
				} else {
					System.out.print(i+",");
					atom.compareAndSet(1,0);
				}
	    }};
	    
	    Thread thread3 = new Thread(run3);
	    Thread thread4 = new Thread(run3);
	    thread3.start();
	    Thread.sleep(100);
	    thread4.start();
	}

	
}
