package observers.consumers;

import observer.iface.WeatherObserver;

public class NewsPaper implements WeatherObserver{
public void doUpdate(int temperature) {
		
		System.out.println("Newspapers are updating temperature as " + temperature);
		//boolean result = new NewsPapers() instanceof WeatherObserver;
		//System.out.println(result);

	}


}
