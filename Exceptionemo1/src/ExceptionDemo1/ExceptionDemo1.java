package ExceptionDemo1;

import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("program task begins");

		try {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		System.out.println("Program completed");

	}

}
}
