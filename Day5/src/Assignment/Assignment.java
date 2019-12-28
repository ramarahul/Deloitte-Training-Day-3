package Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Assignment {
	
	private static String fileName = "D://userdata.txt";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File(fileName);
		if(file.exists()) {
			
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			String line="";
			do {
				line = br.readLine();
				if(line!=null) {
					System.out.println("Username: "+line.split(":")[0]+" - Password: "+line.split(":")[1]);
				}
			}while(line!=null);
			
			if(br!=null) {
				br.close();
			}
		}
		else {
			System.out.println("File does not Exist");
		}
		
		
	}

}
