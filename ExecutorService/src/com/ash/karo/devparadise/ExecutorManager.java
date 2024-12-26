package com.ash.karo.devparadise;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorManager {

	static ExecutorService executorService = Executors.newFixedThreadPool(5);  
	
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		
		
		try {
			executorService.execute(new ExecutorJob());
			Future<AModel> future = executorService.submit(new CallableTask());
			System.out.println(future.get().getId().concat(" " + future.get().getLocation()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			executorService.shutdown();  
			System.out.println("Shutdown");
		}
		
		ExecutorService executorService2 = Executors.newFixedThreadPool(1);  
		
		Set<Callable<String>> callables = new HashSet<>();
		callables.add(() -> "Task 1");
		callables.add(() -> "Task 2");
		String result = executorService2.invokeAny(callables);
		System.out.println("Result: " + result);
		List<Future<String>> result2 = executorService2.invokeAll(callables);
		System.out.println("Result2: " + result2.get(0).get());
		System.out.println("Result2: " + result2.get(1).get());
	}
}
