package com.ash.karo.devparadise;

public class ExecutorJob implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Job running");
		try {
			Thread.sleep(100);
			Thread.currentThread().wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			notifyAll();
		}
	}

}
