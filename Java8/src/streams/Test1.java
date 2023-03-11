package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sun");
		list.add("moon");
		list.add("jupiter");
		list.add("uranus");
		list.add("Pluto");
		list.add("mars");
		list.add("venus");
		Predicate<String>p=(str)->{
			return (str.length()>3||str.length()>5);
		};
		Function<String,String>p1=(str)->{
			return str.toUpperCase();
			
		};
		long count =list.stream()//implicit navigation allows applying of various things Predicate for filter
				.filter(p).count();//function for map
									// consumer for terminal
		
				
		System.out.println(count);
		List<String>l1=list.stream().map(p1).collect(Collectors.toList());
		System.out.println(l1);
		//list.stream().forEach(System.out::println);
		Consumer<String> c=(str)->{
			System.out.println(str);
		};
		list.stream().forEach(c);
		list.stream().filter(p).map(p1).forEach(c);
		

	}

}
