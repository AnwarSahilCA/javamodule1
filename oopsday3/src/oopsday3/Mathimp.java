package oopsday3;

public class Mathimp implements mathIface {

	 

	@Override
	public int factorial(int a) {
		int fact=1;
		for(int i =a;i>0;i--) {
			fact=fact *i;
		}
		// TODO Auto-generated method stub
		return fact;
	}

	@Override
	public void PrimeOrNot(int a) {
		int flag=1;
		for(int i=2;i<a/2;i++) {
			if(a%i==0)
			{
				flag=0;
			}
		}
			if(flag==1)
			{
				System.out.println("prime");
			}
			else
				System.out.println("Not prime");
		
		// TODO Auto-generated method stub
	}

	@Override
	public int add(int n, int m) {
		// TODO Auto-generated method stub
		return n+m;
	}

	@Override
	public int sub(int n, int m) {
		// TODO Auto-generated method stub
		return n-m;
	}

	@Override
	public int mul(int n, int m) {
		// TODO Auto-generated method stub
		return n*m;
	}


}
