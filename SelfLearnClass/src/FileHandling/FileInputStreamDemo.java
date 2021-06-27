package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream stream = null;
		
		try {
			stream = new FileInputStream("fileio");
			int data;
			//int data = stream.read(); // returns ascii value of first char in file
			while((data = stream.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
