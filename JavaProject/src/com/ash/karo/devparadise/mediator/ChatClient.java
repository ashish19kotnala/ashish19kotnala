package com.ash.karo.devparadise.mediator;

public class ChatClient {

	
	/*
	 *  
	 * Mediator Pattern Example in JDK 
	 * java.util.Timer class scheduleXXX() methods
	 * Java Concurrency Executor execute() method. 
	 * java.lang.reflect.Method invoke() method.
	 * 
	 * 
	 */
	
	/*
	 * Mediator Design Pattern Important Points 
	 * 
	 * Mediator pattern is useful when the
	 * communication logic between objects is complex, we can have a central point
	 * of communication that takes care of communication logic. 
	 * 
	 * Java Message Service (JMS) uses Mediator pattern along with Observer pattern to allow applications
	 * to subscribe and publish data to other applications. 
	 * 
	 * We should not use mediator pattern just to achieve lose-coupling because if the number of
	 * mediators will grow, then it will become hard to maintain them.
	 */
	public static void main(String... args) {
		
		// Concrete mediator class, it will have a list of users in the group and provide logic for 
		// the communication between the users.
		ChatMediator mediator = new ChatMediatorImpl();
		
		/*
		 * User has a reference to the mediator object, it’s required for the
		 * communication between different users.
		 */
		User user1 = new UserImpl(mediator, "User 1");
		User user2 = new UserImpl(mediator, "User 2");
		User user3 = new UserImpl(mediator, "User 3");
		User user4 = new UserImpl(mediator, "User 4");
		User user5 = new UserImpl(mediator, "User 5");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		mediator.addUser(user5);
		
		// send() method is using mediator to send the message to the users and it has no idea 
		// how it will be handled by the mediator.
		user1.send("Hello from earth");
	}
}
