package factoryMethod;

public class i20 implements Vehicle {

	@Override
	public void start() {
		System.out.println("i20 started"+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println("i20 stopped"+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void honk() {
		System.out.println("ki ki"+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		System.out.println("vehicle is moving"+getClass());
		// TODO Auto-generated method stub

	}

}
