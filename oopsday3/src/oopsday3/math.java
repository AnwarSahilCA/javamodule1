package oopsday3;

public class math {

	public static void main(String[] args) {
		mathIface m=new Mathimp();
		System.out.println(m.factorial(5));
		System.out.println(m.add(22, 27));
		System.out.println(m.sub(26,20));
		System.out.println(m.mul(5,10));
		m.PrimeOrNot(23);
		// TODO Auto-generated method stub

	}

}
