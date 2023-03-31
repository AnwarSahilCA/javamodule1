package assessment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class string1 {

	public static void main(String[] args) {
		String str="abcaabcd";
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
		map.put(str.charAt(i),0);
		}
		Set<Character> strin=map.keySet();
		for(Character s:strin){
			System.out.println(s);
		}
		// TODO Auto-generated method stub

	}

}
