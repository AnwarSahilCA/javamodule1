package oopsday1.setget;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Car jag =new Car();
		 jag.setColor("Black");
		 jag.setPrice(7500000);
		 jag.setBrand("Jaguar");
		 jag.setModel("XF");
		 /* jag.color="Black"; jag.price=1300000;
		 * jag.brand="Hyundai"; jag.model="i20N"; System.out.println(jag.color);
		 * System.out.println(jag.price); System.out.println(jag.brand);
		 * System.out.println(jag.model);
		 */
		 System.out.println(jag.getColor());
		 System.out.println(jag.getPrice());
		 System.out.println(jag.getBrand());
		 System.out.println(jag.getModel());
		 /*
		 
		Car volvo=new Car();
		 volvo.color="Silver";
		 volvo.price=7500000;
		 volvo.brand="volvo";
		 volvo.model="XC60";
		System.out.println(jag.getColor());
		 System.out.println(jag.getPrice());
		 System.out.println(jag.getBrand());
		 System.out.println(jag.getModel()); 
			*/
		
	}

}
