package com.ash.karo.devparadise.state;

public class TVStopState  implements State{

	@Override
	public void doAction() {
		System.out.println("TV is OFF / Stopped");
	}
}
