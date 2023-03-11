package statemachine;

import java.util.Scanner;

public class Machine {
	public static void main(String[] args) {
		int hun = 4;
		int five = 100;
		int fift = 50;
		int total = 0;
		int amt = 0;
		int five1 = 0;
		int hun1 = 0;
		int denom=0;
		int count=0;
		// int ten=10;
		while(count<2)
		{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount");
		
		int input = s.nextInt();
		// amount needed
		System.out.println("Enter no of denomination of 500");
		int denom1 = s.nextInt();
		if (denom1!=0 && denom < five) {
			five -= denom1;
			five1 = denom1;
		}
		else {
			if(denom1>five)
			System.out.println("insufficient 500 balance");
			denom=0;
		}
		if (denom1 * 500 == input) {
			System.out.println("disepnsed" + denom1 + "notes");
			System.exit(0);
		} else {

						System.out.println("Enter no of denomination of 100");
						denom = s.nextInt();
						if (denom!=0 && denom < hun)

						{
							hun -= denom;
							hun1 = denom;
						}
						else {
							if(denom>hun)
								System.out.println("Insufficient 100 balance");
								denom1=0;
						}
							
						if (denom * 100+ denom1*500 == input) {
							System.out.println("Dispensed" + five1+ " 500 notes");
							System.out.println("Dispensed " + denom + "notes");
							System.exit(0);
							
						} else 
						{
							System.out.println("ENter remaining number of notes with 50 denomination");
							denom = s.nextInt();
							fift -= amt;
							
							
							
																	}
						}
		if (hun1 * 100 + denom * 50 +five1*500 == input) {
			System.out.println("Dispensed " + denom + " 50notes");
			System.out.println("Dispensed " + hun1 + " 100 notes");
			System.out.println("Dispensed" + five1+ " 500 notes");
			System.exit(0);
			
		}
		else {
			System.out.println("please enter appropriate type of notes");
			count++;
		}
		
		}
		if(count==2) {
			System.out.println("Exit from atm");
		}
				
	}
}


