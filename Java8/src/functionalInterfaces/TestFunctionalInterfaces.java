package functionalInterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFunctionalInterfaces {

	public static void main(String[] args) {
		Function <String,Integer>f=(str)->{
			return str.length();
			};
		List<String> strings=Arrays.asList("Andra Pradesh","Tamil Nadu","kerala","Karnataka","Telangana");
		for(String str:strings) {
			System.out.println(f.apply(str));
		}
		
		
		System.out.println(f.apply("buneos dias"));
		Function<Integer, Integer>f2=(n)->{
			return n*n;
		};
		System.out.println(f2.apply(25));
		Function<String,String>f3=(str)->{
			return str.toUpperCase();
		};
		System.out.println(f3.apply("ust kulathoor global"));
		// TODO Auto-generated method stub

	}

}
