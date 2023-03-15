package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
		Address resAdd=new Address("31","Mannath","Worli","mumbai",400002);
				Address comAdd=new Address("32","Antela","Bandra","mumbai",400032);
		Employee emp1=new Employee("John Doe","male",24,101,"Research",40000,resAdd,comAdd);
		System.out.println(emp1);
		Employee emp2=new Employee("Jane Doe","Female",23,102,"Accounting",35000,resAdd,comAdd);
		System.out.println(emp2);
		Employee emp3=new Employee("Jason Doe","male",28,103,"Sales",10000,resAdd,comAdd);
		System.out.println(emp3);
		Employee emp4=new Employee("Jones Doe","male",23,104,"Research",40000,resAdd,comAdd);
		System.out.println(emp4);
		Employee emp5=new Employee("John Doe","male",24,101,"Research",40000,resAdd,comAdd);
		System.out.println(emp5);
		if(emp1.equals(emp5) ) {
			System.out.println("Objects are same");
		}
		else
			System.out.println("objects are not same");

	}

}
