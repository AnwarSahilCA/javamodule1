
package oopsday2;

public class Carfactory {

	public static void main(String[] args) {
		Car car=new Car(5000,500,0,false);
		car.start();
		car.move();
		car.honk();
		car.stop();
		System.out.println(car);
		// TODO Auto-generated method stub

	}

}
