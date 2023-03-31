
package statemachine;

public class Atm implements ATMIface {
	public static int chance=0;
	private int a;
	private int notec;
	

	public Atm() {
	
	}
	


	
	public Atm(int a, int notec) {

	
		this.a = a;
		this.notec = notec;
	}



	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public int getNotec() {
		return notec;
	}



	public void setNotec(int notec) {
		this.notec = notec;
	}



	@Override
	public int total( int amt, int count)
	{
		int flag=0;
	boolean bool=false;
	int temp=0;
		if(count<this.notec && bool==false && chance<=1) {
		this.notec-=count;
		}
		else
		{
			if(count>this.notec) {
				if(chance>0) {
					System.out.println("Erro 404");
				System.exit(0);
				}
				System.out.println("Insufficient balance. Enter another denomination");
				chance++;
				flag=1;
				
				
				
		}
		}
		if(count*this.a==amt && flag==0)
		{
			
			System.out.println("Dispensed"+count+"notes");
			bool=true;
			temp=count;
		}
		
		
		// TODO Auto-generated method stub
		return 0;
	}
}


