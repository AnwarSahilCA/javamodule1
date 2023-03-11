package userdefined;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
//USER DEFINED OBJECT ARRAY.

public class TestEmpArrayList {

	public static void main(String[] args) {
		TreeSet<Employee> emplist=new TreeSet<Employee>();
		Employee emp1=new Employee("John Doe","male",24,101,"Research",40000);
		
		Employee emp2=new Employee("Jane Doe","Female",23,102,"Accounting",35000);
		
		Employee emp3=new Employee("Jason Doe","male",28,103,"Sales",10000);
		
		Employee emp4=new Employee("Jones Doe","male",23,104,"Research",40000);
		
		Employee emp5=new Employee("John Doe","male",24,101,"Research",40000);
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		System.out.println(emplist);
		// TODO Auto-generated method stub

	}

}
