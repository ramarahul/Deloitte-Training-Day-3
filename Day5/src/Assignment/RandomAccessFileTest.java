package Assignment;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf = new RandomAccessFile("D://passwords.txt","r");
		raf.seek(16);
		System.out.println(raf.readLine());

	}

}
