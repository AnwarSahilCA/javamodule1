package strategy.impl;

import strategy.iface.SocialMediaStrategy;

public class FacebookStrategy implements SocialMediaStrategy{

	@Override
	public void connectTo(String friendName) {
		    System.out.println("Connecting with " + friendName + " through Facebook");
		  }
	  
	}


