package ExceptionDemo1;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		System.out.println("Program Task begins");
		try {
			System.out.println("entered try.....");
			int c=10/0;
			System.out.println("from try afterexception.....");
			
			
		}catch(Exception e) {
			System.out.println("from catch...");
			
		}
		catch(ArithmeticException e) {
			e.PrintStrackTrace
			
		}finally {
			System.out.println("From finally");
		}
		System.out.println("program Completed task");
	}

}
