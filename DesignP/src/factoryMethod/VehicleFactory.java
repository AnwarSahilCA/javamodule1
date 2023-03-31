package factoryMethod;

public class VehicleFactory {
	public static Vehicle newInstance(String car) {
		Vehicle vehicle=null; //Interface object is created to provide abstraction 
		if(car==null)
			return null;
		else if(car.equals("Seltos"))
			vehicle=new Seltos();
		else if(car.equals("i20"))
			vehicle=new i20();
		return vehicle;
	}

}
