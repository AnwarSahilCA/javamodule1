package listdemo;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList flowers=new ArrayList();
		flowers.add("tulips");
		//flowers.add(new java.util.Date());
//		flowers.add(new java.util.Scanner(System.in));
		flowers.add("Rose");
		flowers.add("Jasmine");
		flowers.add("Lilly");
		flowers.add("Cosmos");
		System.out.println(flowers.size());
		System.out.println(flowers);
		System.out.println(flowers.get(2));
		System.out.println(flowers.contains("Lilly"));
		flowers.add(2, "Sunflower");
		//Object a=flowers.remove(2);
		Iterator iter=flowers.iterator();
		while(iter.hasNext());
		System.out.println(iter.next());
		for(int i=0;i<flowers.size();i++)
			System.out.println(flowers.get(i));
		for(Object obj:flowers) {
			System.out.println(obj);
		}
		Object obj=flowers.get(3);
		if(obj instanceof Integer)
		{
			Integer in=(Integer) obj;
			System.out.println(in.MIN_VALUE);
		}
		else if(obj instanceof Double)
		{
			Double d=(double)obj;
			System.out.println(d.MAX_VALUE);
		}
		else if(obj instanceof String)
		{
		
	
			String str=(String) obj;
			System.out.println(str.toUpperCase());
		}
		//else if(obj instanceof new java.util.Date()) {
			
		
		
	}

}
