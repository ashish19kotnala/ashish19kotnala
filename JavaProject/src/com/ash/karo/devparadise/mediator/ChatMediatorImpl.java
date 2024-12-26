package com.ash.karo.devparadise.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

	
	private List<User> users;
	
	public ChatMediatorImpl() {
		users =  new ArrayList<>();
	}

	@Override
	public void sendMessage(String msg, User user) {
		users.stream().filter(a -> a != user).forEach(a -> a.receive(msg));
		
	}

	@Override
	public void addUser(User user) {
		users.add(user);		
	}
	
}
