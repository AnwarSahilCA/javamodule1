package userdefined;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("John Doe","male",24,101,"Research",40000);
		
		Employee emp2=new Employee("Jane Doe","Female",23,102,"Accounting",35000);
		
		Employee emp3=new Employee("Jason Doe","male",28,103,"Sales",10000);
		
		Employee emp4=new Employee("Jones Doe","male",23,104,"Research",40000);
		
		Employee emp5=new Employee("John Doe","male",24,101,"Research",40000);
		HashSet<Employee> emplist=new HashSet<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		ArrayList<Employee> empArray=new ArrayList<Employee>();
		empArray.add(emp1);
		empArray.add(emp2);
		empArray.add(emp3);
		empArray.add(emp4);
		empArray.add(emp5);
		TreeSet<Employee> emptree=new TreeSet<Employee>();
		emptree.add(emp1);
		emptree.add(emp2);
		emptree.add(emp3);
		emptree.add(emp4);
		emptree.add(emp5);
		HashMap<String,Collection>emphash=new HashMap<>();
		emphash.put("ArrayList", empArray);
		emphash.put("emplist", emplist);
		emphash.put("emptree", emptree);
		System.out.println(emphash);
		Collection<Employee> list=emphash.get("empList");
		Iterator<Employee> iter=list.iterator();
		while(iter.hasNext())
				System.out.println(iter.next());
		Collection<Employee> set=emphash.get("empSet");
		iter=list.iterator();
		while(iter.hasNext())
				System.out.println(iter.next());
		Collection<Employee> tree= emphash.get("emptree");
		iter=tree.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		
		// TODO Auto-generated method stub

	}

}
