package listdemo;
import java.util.HashSet;
import java.util.Iterator;
public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> bookSet =new HashSet<>();
		bookSet.add("Java in a nutshell");
		bookSet.add("Java complete reference");
		bookSet.add("Thinking in java");
		bookSet.add("Java in 21 days");
		bookSet.add("Java for dummys");
		bookSet.add(null);
		bookSet.add(null);
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.err.println(bookSet.contains("Java in a nutshell"));
		bookSet.add("Thinking in java");
		System.out.println(bookSet.size());
		for(String book:bookSet)
		{
			System.out.println(book);
		}
		Iterator<String> iter=bookSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		// TODO Auto-generated method stub

	}

}
