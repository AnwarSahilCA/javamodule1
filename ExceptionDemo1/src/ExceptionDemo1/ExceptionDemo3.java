package ExceptionDemo1;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		System.out.println("Program Task begins");
		try {
			catch(ArithmeticException e) {
				e.PrintStackTrace();
				
			}catch(Exception e) {
			System.out.println("from catch...");
			
		}
		finally {
			System.out.println("From finally");
		}
		System.out.println("program Completed task");
	}

}
