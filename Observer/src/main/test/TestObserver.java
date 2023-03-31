package main.test;

import observer.subjectimpl.WeatherStation;
import observers.consumers.TVChannel;
import observers.consumers.NewsPaper;

public class TestObserver {

	public static void main(String[] args) {
		TVChannel observer1 = new TVChannel(); // subscriber
		NewsPaper observer2 = new NewsPaper(); // subscriber
		TVChannel observer3 = new TVChannel();
	
		WeatherStation weatherStation = new WeatherStation(33);
		weatherStation.addObserver(observer1);
		weatherStation.addObserver(observer2);
		weatherStation.addObserver(observer3);

		weatherStation.setTemparature(30);

		// weatherStation.removeObserver(observer1);
		// TODO Auto-generated method stub

	}

}
