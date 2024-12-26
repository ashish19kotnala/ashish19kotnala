package com.ash.karo.devparadise.state;


/*
 * Here client code should know the specific values to use for setting the state of remote. 
 * Further more if number of states increase then the tight coupling between implementation and 
 * the client code will be very hard to maintain and extend. Now we will use State pattern to implement 
 * above TV Remote example - TVControllerRemote.java
*/

public class TVRemoteMainBasic {

	private String state="";
	
	public void setState(String state){
		this.state=state;
	}
	
	public void doAction(){
		if(state.equalsIgnoreCase("ON")){
			System.out.println("TV is turned ON");
		}else if(state.equalsIgnoreCase("OFF")){
			System.out.println("TV is turned OFF");
		}
	}

	public static void main(String args[]){
		TVRemoteMainBasic remote = new TVRemoteMainBasic();
		
		remote.setState("ON");
		remote.doAction();
		
		remote.setState("OFF");
		remote.doAction();
	}

}
