package testlambdas;

public class LambdaSwitchCase {
	static double calculate(String operator,double x, double y) {
	return switch(operator) {
	case "+" -> x + y;
	case "-" -> x - y;
	case "*" -> x * y;
	case "/" -> {
		if(y==0)
		{
			throw new IllegalArgumentException("cant divide by zero");
	}
	yield x / y;
	}
	
	default -> throw new IllegalArgumentException("Unknown operator");
	};
}
	public static void main(String[] args) {
		System.out.println(calculate("+",20,30));
		System.out.println(calculate("-",30,10));
		
	}
}
