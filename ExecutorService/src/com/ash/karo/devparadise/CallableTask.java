package com.ash.karo.devparadise;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<AModel>{

	@Override
	public AModel call() throws Exception {
		// TODO Auto-generated method stub
		//notify();
		return new AModel("Ash","India");
	}

}
