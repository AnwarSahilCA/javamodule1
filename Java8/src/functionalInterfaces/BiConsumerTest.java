package functionalInterfaces;


import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		HashMap<String,String>map=new HashMap<>();
		map.put("hello", "H");
		map.put("Ola", "o");
		map.put("Chao", "C");
		

		map.forEach((k,v)->
		System.out.println(k+"and"+v));
		BiConsumer<String, String> bi=(k,v)->{  //It takes two inputs and produces an output for those 2 inputs
			System.out.println(k+"and"+v);
		};
		map.forEach(bi);
		// TODO Auto-generated method stub

	}	
}
