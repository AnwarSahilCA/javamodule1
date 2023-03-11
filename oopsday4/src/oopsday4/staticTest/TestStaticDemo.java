package oopsday4.staticTest;

public class TestStaticDemo {
	public static void main(String [] args) {
	StaticDemo d=new StaticDemo();
	System.out.println(d.a);
	StaticDemo d1=new StaticDemo();
	System.out.println(d1.a);
	System.out.println(StaticDemo.a);
	
	}

}
