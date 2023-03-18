package lsp;

public class Lspdemo {
	public void Calculate(Shape s) {
		System.out.println(s.getarea());
	}

	public static void main(String[] args) {
		Lspdemo lsp=new Lspdemo();
		lsp.Calculate((new Rectangle(1,4)));
		lsp.Calculate((new Square(5)));
		
		// TODO Auto-generated method stub

	}

}
