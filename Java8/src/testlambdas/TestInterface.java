package testlambdas;
@FunctionalInterface
public interface TestInterface{

		public double method();
		public default void method2() {
			System.out.println("From method2 ");
		}
		public static void method3() {
			System.out.println("From Static method");
		}
}
		// TODO Auto-generated method stub
		


