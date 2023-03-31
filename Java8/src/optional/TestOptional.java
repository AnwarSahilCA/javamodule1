package optional;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		String str=null;
		String str1="hello";
		//Optional<String> optional=Optional.of(str);
		
		Optional<String> optional1=Optional.ofNullable(str1);//checking absense and presence of values
				if(optional1.isPresent())
					System.out.println("Nullable"+optional1.get());
				else 
					System.out.println("its null"+optional1.orElse("Str is not initialized"));//when str is used we will get no such element exception.
		// TODO Auto-generated method stub

	}

}
