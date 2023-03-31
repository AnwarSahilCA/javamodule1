
package strategy.context;

import strategy.iface.SocialMediaStrategy;

public class SocialMediaContext {
	SocialMediaStrategy smStrategy;
	 
	  public void setSocialmediaStrategy(SocialMediaStrategy
			  smStrategy) 
	  {
	    this.smStrategy = smStrategy;
	  }
	 
	  public void connect(String name) 
	  {
	    smStrategy.connectTo(name);
	  }


}
