package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectCopier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("akash",12345);
		try {
			FileOutputStream fout = new FileOutputStream("D://std.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(st1);
			oos.flush();
			oos.close();
			System.out.println("Object serialized");
		}
		catch(Exception e) {
			System.out.println("Object failed to Serialize "+e.getMessage());
		}

	}

}
