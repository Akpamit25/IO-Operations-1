package com.IO_Operations;
import java.io.*;
import java.util.*;
public class FileOutputStream_Demo1 {

	//1. Creating a file
	//2. Taking Input From Keyboard
	//3. Write Input to the file.
	
	public static void main(String[] args) {
		int ch = 0;
		System.out.println("Enter Your Message");
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = null;
	
		try {
			File f1 = new File("D:\\Capg_Personal\\IO Operations\\src\\com\\IO_Operations", "temp1.txt");
			f1.createNewFile();
			 fos = new FileOutputStream(f1);
			 while ((ch = (char)dis.read()) != -1)
			 {
				 fos.write(ch);
			 }
			//byte barr[] = str.getBytes();
			//fos.write(barr);
			//fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());

			}

		}

	}
}
