package assessment;
import java.util.HashMap;

public class substring {
	public static int countsub(String str) {
		int count=0;
		HashMap<Character,Integer>counts=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			counts.put(str.charAt(i), 0);
		}
//		int counts[]=new int[str.length()];
		
		for(int i=0;i<str.length();i++) {
			if(counts.get(str.charAt(i))==0) {
			counts.put(str.charAt(i), 1);
			count++;
		}
		}
		return count;
		
	}
	public static void main(String[] args) {
		System.out.println(countsub("abcdaafghijkl"));
	
		
	}
}
