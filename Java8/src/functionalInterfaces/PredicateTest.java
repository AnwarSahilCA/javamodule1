package functionalInterfaces;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		List<String> strings=Arrays.asList("Andra Pradesh","Tamil Nadu","kerala","Karnataka","Telangana");
		Predicate<String > p1=(str)->{
			return str.length()>7;
		};
		length(strings,p1);
		// TODO Auto-generated method stub

	}
	public static void length(List<String> strings, Predicate<String>p ) {
		for(String str:strings)
		System.out.println(p.test(str));
	}

}
