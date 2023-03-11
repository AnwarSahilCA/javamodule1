package oopsday1;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car jag =new Car();
		jag.color="Black";
		jag.price=1300000;
		jag.brand="Hyundai";
		jag.model="i20N";
		System.out.println(jag.color);
		System.out.println(jag.price);
		System.out.println(jag.brand);
		System.out.println(jag.model);
		
		 Car volvo=new Car();
		 volvo.color="Silver";
		 volvo.price=7500000;
		 volvo.brand="volvo";
		 volvo.model="XC60";
		 System.out.println(volvo.color);
			System.out.println(volvo.price);
			System.out.println(volvo.brand);
			System.out.println(volvo.model);
			volvo=jag;
		 
	}

}
