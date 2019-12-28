package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileCopier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length<2) {
			System.out.println("Usage: java FileCopier infile outfile");
		}
		
		String inFile = args[0];
		String outFile = args[1];
		
		//InputStream in;
		//OutputStream out;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(inFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		FileOutputStream fout = null;
		PrintStream out = null;
		try {
			fout = new FileOutputStream(outFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		out = new PrintStream(fout);
		
		try {
			int bite = fis.read();
			while(bite != -1) {
				out.print((char)bite);
				bite = fis.read();
			}
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			if(out!=null) {
				out.close();
			}
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
