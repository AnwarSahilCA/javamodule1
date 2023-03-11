package listdemo;

import java.util.TreeSet;
import java.util.Iterator;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeSet<String> bookSet =new TreeSet<>();
			bookSet.add("Java in a nutshell");
			bookSet.add("Java complete reference");
			bookSet.add("Thinking in java");
			bookSet.add("Java in 21 days");
			bookSet.add("Java for dummys");
//			bookSet.add(null);
//			bookSet.add(null); TREE SET DOESNT ALLOW NULL ELEMENT
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
			

	}

}
