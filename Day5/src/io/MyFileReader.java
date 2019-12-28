package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	
	private static String fileName ="D://data.txt";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(fileName);
		boolean fileExists = file.exists();
		System.out.println("File available? "+file.exists());
			if(fileExists) {
			System.out.println(file.getPath());
			
			//Read file contents
			FileReader reader = null;
			BufferedReader buffer = null;
			try {
				 reader = new FileReader(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("File does not exist");
				e.printStackTrace();
			}
			
			buffer = new BufferedReader(reader);
			String line="";
			try {
				
				line = buffer.readLine();
				while(line!=null) {
				System.out.println(line);
				line = buffer.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error reading File"+ e.getMessage());
				e.printStackTrace();
			}
			finally {
				if(buffer!=null) {
					try {
						buffer.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(reader!=null) {
					try {
						reader.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
