package factoryMethod;

public class UseVehicleFactory {
	public static void main(String[] args) {
	Vehicle seltos=VehicleFactory.newInstance("Seltos");
	seltos.start();
	Vehicle i20=VehicleFactory.newInstance("i20");
	i20.move();
	
	}

}
