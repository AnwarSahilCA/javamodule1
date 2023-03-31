package observers.consumers;

import observer.iface.WeatherObserver;

public class TVChannel implements WeatherObserver {
		
	public void doUpdate(int temperature) {
		System.out.println("TV Channel updating temperature as "+temperature);
		
	}


}
