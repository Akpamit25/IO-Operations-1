package com.IO_Operations;//
import java.io.*;
public class FileWriter_Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		int ch = 0;
		FileWriter fw = null;
		//String str = "This is my Output Stream";
		try {
			 fw = new FileWriter("D:\\Capg_Personal\\IO Operations\\src\\com\\IO_Operations\\log1.txt");
			fw.write("Welcome To Character Stream");
			fw.flush();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());

			}

		}

	}
}
