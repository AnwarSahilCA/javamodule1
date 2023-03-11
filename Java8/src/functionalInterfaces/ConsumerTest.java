package functionalInterfaces;
import java.util.function.Consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {
		List<String> strings=Arrays.asList("Andra Pradesh","Tamil Nadu","kerala","Karnataka","Telangana");
		Consumer<String> consumer=(str)->{
			System.out.println(str);
		};
		consumer.accept("Iam doing great");
		printStrings(strings,consumer);
		
		// TODO Auto-generated method stub

	}
	public static void printStrings(List<String>string, Consumer<String> cons) {
		for(String st:string) {
			cons.accept(st);
		}
	}

}
