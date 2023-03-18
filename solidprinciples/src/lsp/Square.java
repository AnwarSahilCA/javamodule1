package lsp;

public class Square implements Shape {
	private int side;
	
	public Square(int side) {
		super();
		this.side = side;
	}

	public int getarea() {
		return this.side*this.side;
	}

	

}
