package statemachine;
import java.util.Scanner;

public class Atmface extends Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm a=new Atm(100,10);
		Atm b=new Atm(500,50);
		Atm c=new Atm(50,10);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amt=sc.nextInt();
		System.out.println("Enter the number  of 100:");
		int huncount=sc.nextInt();
		a.total(amt, huncount);
		System.out.println("Enter the number  of 500:");
		int fivecount=sc.nextInt();
		b.total(amt, fivecount);
		System.out.println("Enter the number  of 50:");
		int fiftcount=sc.nextInt();
		c.total(amt, fiftcount);
		
		
		
	}

}
