package ioserialization;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardtoFile {

	public static void main(String[] args) throws IOException{
		
		// TODO Auto-generated method stub
		String data=null;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader reader=new BufferedReader(isr);
		FileWriter writer=new FileWriter("Nammadafile.txt");
		System.out.println("Enter some text");
		data=reader.readLine();
		while(!data.equals("quit"))
		{
			writer.write(data);
			System.out.println("you have entered.."+ data);
			data=reader.readLine();
		}
		writer.flush();
		writer.close();
		reader.close();
		System.out.println("main Existed");
	}

}
