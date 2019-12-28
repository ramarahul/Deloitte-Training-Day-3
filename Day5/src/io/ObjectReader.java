package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("D://std.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student st1 = (Student)ois.readObject();
			System.out.println(st1);
			ois.close();
		}
		catch(Exception e) {
			System.out.println("Object could not be read "+e.getMessage());
		}

	}

}
