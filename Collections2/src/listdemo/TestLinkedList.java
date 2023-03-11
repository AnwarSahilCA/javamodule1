package listdemo;
import java.util.LinkedList;
import java.util.Iterator;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<>();
		list.add("pencil");
		list.add("book");
		list.add("eraser");
		list.add("marker");
		list.add("Sharpener");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(2));
		list.add(2,"Sticky notes");
		System.out.println(list);
		Iterator<String> iter=list.descendingIterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		// TODO Auto-generated method stub
		iter=list.listIterator();
		while(iter.hasNext()) {
			String element=iter.next();
			if(element.equals("pencil")) {
				iter.remove();
			}
		}
			System.out.println(list);
	}

}
