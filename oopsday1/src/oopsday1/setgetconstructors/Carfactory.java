package oopsday1.setgetconstructors;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Car jag = new Car("Yellow",4000000,"Toyota","Etios");
		 /* jag.color="Black"; jag.price=1300000;
		 * jag.brand="Hyundai"; jag.model="i20N"; System.out.println(jag.color);
		 * System.out.println(jag.price); System.out.println(jag.brand);
		 * System.out.println(jag.model);
		 */
		 System.out.println(jag.hashCode());
		 System.out.println(Integer.toHexString(jag.hashCode()));
		 System.out.println(jag);
		 //System.out.println(jag.getModel());
		 
		 
		Car volvo =new Car("Brown",8500000,"Jag","XF");
		System.out.println(volvo);
		System.out.println(volvo.hashCode());
		System.out.println(Integer.toHexString(volvo.hashCode()));
		/*System.out.println(volvo.getColor());
		 System.out.println(volvo.getPrice());
		 System.out.println(volvo.getBrand());
		 System.out.println(volvo.getModel()); 
		*/	
		
	}

}
