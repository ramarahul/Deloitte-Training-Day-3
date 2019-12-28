package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopier {
	
	private static String fileNameR = "D://passwords.txt";
	private static String fileNameW = "D://newpasswords.txt";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader(fileNameR);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(fileNameW);
		PrintWriter out = new PrintWriter(fw);
		
		String line="";
		do {
			line = br.readLine();
			if(line!=null) {
				out.println(line);
			}
		}while(line!=null);
		out.flush();
		System.out.println("File copy successful!");
		
		if(br!=null) {
			br.close();
		}
		if(out!=null) {
			out.close();
		}
		

	}

}
