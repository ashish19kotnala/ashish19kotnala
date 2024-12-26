package com.ash.karo.devparadise.state;

public class TVControllerRemote {

	/*
	 * The benefits of using State pattern to implement polymorphic behavior is
	 * clearly visible. The chances of error are less and it’s very easy to add more
	 * states for additional behavior. Thus making our code more robust, easily
	 * maintainable and flexible. Also State pattern helped in avoiding if-else or
	 * switch-case conditional logic in this scenario. State Pattern is very similar
	 * to Strategy Pattern
	 */
	public static void main(String[] args) {

		TvContext context = new TvContext();
		
		// We can have two states - one for turning TV on and another to turn it off
		TVStartState startState = new TVStartState();
		TVStopState stopState = new TVStopState();
		
		//  Context object that will change its behavior based on its internal state.
		context.setTvstate(startState);
		context.doAction();
		
		context.setTvstate(stopState);
		context.doAction();
	}
}
