package oopsday3;

public class Compare {
	public static void main(String[] args) {
		Rectangle r1= new Rectangle();
		Rectangle r2= new Rectangle();
		Triangle t1=new Triangle();
		Triangle t2=new Triangle();
		int a=10;
		int b=35;
		boolean result = a==b; //are they same?
		//1. comparing references 2. comparing members
		Rectangle r3=r1;
		result =r3==r1;
		System.out.println(result);
		result = t1==t2;
		System.out.println(r1.hashCode());
		System.out.println(r3.hashCode());
		System.out.println(r2.hashCode());
		result=r1.equals(r2);//not applicable for primitives
		System.out.println(result);
		result=r1.equals(r3);
		System.out.println(result);
		r1.setLength(35.5);
		r1.setBreadth(75.45);
		r2.setBreadth(75.45);
		r1.setLength(35.5);
		if(r1.getBreadth()==r2.getBreadth() && r1.getLength() == r2.getLength())
			System.out.println("THey have the same l and b");
		else
			System.out.println("they are not same");//
		t1.setS1(35.5);
		t1.setS2(45.75);
		t1.setS2(65.5);
		//we are not comparing objects  r1 and t1
		// we are comparing data members of the two objects
		if(r1.getLength()==t1.getS1()) {
			System.out.println("the length and s1 are same");
		}
			else 
				System.out.println("Length are not same");
		}
	}


