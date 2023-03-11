package testlambdas;
interface Shape{
	double area();
}
interface Math{
	double power(int b, int e);
}
@FunctionalInterface
interface fact{
	int factorial(int a);
}

public class Example1 {

	public static void main(String[] args) {
//		Shape s=()->{
//			return 0.0;
//		};
//		double result=s.area();
//		System.out.println(result);
//		Math m=(int b,int e)->{ 
//			int p=1;
//			for(int i=1;i<=e;i++)
//				p*=b;
//			return p;
//		};
//		double p=m.power(2,3);
//		System.out.println(p);
//		}
//		Runnable r1=new Runnable() {
//			public void run() {
//				System.out.println("from run method");
//			}
//		};
//		Thread t1=new Thread(r1);
//		t1.start();
		fact f=(int a)->{
			int facto=1;
			for(int i=a;i>0;i--)
			{
				facto=facto*i;
			}
			return facto;
				
			
		};
		System.out.println(f.factorial(5));
	
		// TODO Auto-generated method stub

	}
}


