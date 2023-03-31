package creationalPatterns;

public class TestConnection {

	public static void main(String[] args) {
		connection1 con1=connection1.getconnection1();
		connection1 con2=connection1.getconnection1();
		if(con1.hashCode()==con2.hashCode()) {
			System.out.println("connection is singleton");
		}
		else
			System.out.println("connection is not");
		// TODO Auto-generatesd method stub

	}

}
