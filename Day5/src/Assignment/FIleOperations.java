package Assignment;

import java.io.File;
import java.text.SimpleDateFormat;

public class FIleOperations {
	
	//private static String  fileName = "D://passwords.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D://myData");
		boolean done = file.mkdir();
		
		System.out.println(done);
		String[] files = file.list();
		System.out.println(file.getName());
		System.out.println("Name\t"+"LastModified\t\t"+"Size");
		for(String s: files) {
			File f = new File(file.getPath()+"/"+s);
			SimpleDateFormat srf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			System.out.println(s+"\t"+srf.format(f.lastModified())+"\t"+f.length() );
		}

	}

}
