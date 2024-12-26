package com.ash.karo.devparadise.state;

public class TvContext implements State{

	private State tvstate;

	public State getTvstate() {
		return tvstate;
	}

	public void setTvstate(State tvstate) {
		this.tvstate = tvstate;
	}

	@Override
	public void doAction() {
		tvstate.doAction();
	}
}
