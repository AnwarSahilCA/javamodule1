package serialization.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectStreamClass;
import java.util.Iterator;


public abstract class TestEmployee2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
			
		
		FileInputStream fos = new FileInputStream("D:\\ustcore\\ioserialization\\emp.dat");
		ObjectInputStream ois = new ObjectInputStream(fos);
		Object obj = ois.readObject();
		Employee ref = (Employee) obj;
		System.out.println(ref);

		// TODO Auto-generated method stub

	}

}
