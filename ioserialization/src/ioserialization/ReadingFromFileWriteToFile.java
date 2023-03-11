package ioserialization;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFromFileWriteToFile {

	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("D:\\ustcore\\ioserialization\\src\\ioserialization\\KeyboardtoFile.java");
		BufferedReader buffer=new BufferedReader(reader);
		FileWriter writer=new FileWriter("NewFile.txt");
		String data=buffer.readLine();
	while(data!=null) {
			writer.write(data+"\n");
		data=buffer.readLine();
			
	}
	reader.close();
	writer.close();
	
		 writer=new FileWriter("Copy.txt");
		reader=new FileReader("D:\\ustcore\\ioserialization\\src\\ioserialization\\KeyboardtoFile.java");
		buffer =new BufferedReader(reader);
		data=null;
		while((data=buffer.readLine())!=null) {
			writer.write(data+"\n");
		}
		writer.flush();
		buffer.close();
		writer.close();
		reader.close();// TODO Auto-generated method stub

	}

}
