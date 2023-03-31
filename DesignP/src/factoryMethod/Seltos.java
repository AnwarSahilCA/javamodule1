package factoryMethod;

public class Seltos implements Vehicle {

	@Override
	public void start() {
		System.out.println("vehicle started"+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println("Vehicle stopped"+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void honk() {
		System.out.println("pom pom"+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		System.out.println("vehicle is moving"+getClass());
		// TODO Auto-generated method stub

	}

}
