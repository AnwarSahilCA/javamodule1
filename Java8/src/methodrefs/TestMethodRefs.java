package methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface Formula{
		public void m1();
	}
	class Some{
		public static void m2() {
			System.out.println("from m2.....");
			
		}
	}
	class Other{
		Other(){
			System.out.println("From other constructor");
		}
	}
	public class TestMethodRefs {
	public static void main(String[] args) {
		Formula f=Some::m2;
				f.m1();
				f =Other::new;//calling constructor method reference 
				List<String> list=Arrays.asList("one","two","three");
				list.stream().forEach(System.out::println);//isntance method reference
				List<Integer> integerlist=Arrays.asList(1,2,3,4,5);
				Optional<Integer>num=integerlist.stream().reduce(Math::max); //static method reference
				System.out.println(num.get());
		}
		}
		// TODO Auto-generated method stub

	


