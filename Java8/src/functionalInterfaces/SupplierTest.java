package functionalInterfaces;
import java.util.function.Supplier;

import java.util.Arrays;
import java.util.List;

public class SupplierTest {

	public static void main(String[] args) {
		List<String> strings=Arrays.asList("Andra Pradesh","Tamil Nadu","kerala","Karnataka","Telangana");
		Supplier<String> supplier=()->{
			return new String("hola!");
			
		};
		System.out.println(supplier.get());
		

		// TODO Auto-generated method stub

	}
		
	}


