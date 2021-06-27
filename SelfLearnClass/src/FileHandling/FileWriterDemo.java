package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		FileWriter stream = null;
		
		try {
			stream = new FileWriter("FileWriterIO");
			String str = "file reader/writer";
			char[] c = str.toCharArray();
			//System.out.println(c);
			stream.write(c);
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
