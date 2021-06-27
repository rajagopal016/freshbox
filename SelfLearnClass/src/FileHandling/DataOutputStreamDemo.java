package FileHandling;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {

	public static void main(String[] args) {

		DataOutputStream stream = null;
		try {
			stream =new DataOutputStream(new FileOutputStream("dataIO"));
			// DataOutputStream converts primitives to byte, FileOutputStream writes to file, dataIO is file name
			stream.writeInt(10);
			stream.writeFloat(2.3f);
			stream.writeChar('a');
			stream.writeBoolean(false);
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
