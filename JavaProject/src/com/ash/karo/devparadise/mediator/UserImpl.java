package com.ash.karo.devparadise.mediator;

public class UserImpl extends User	{

	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg) {
		System.out.println("Sent message = " + msg + " from user: " + this.name);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println("Received message = " + msg + " from user: " + this.name);
	}

	
}
