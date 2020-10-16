package com.IO_Operations;

import java.io.FileInputStream;//
import java.io.*;

public class FileInputStream_Demo {

	public static void main(String[] args) {
		int ch = 0;
		FileInputStream fis = null;//

		try {
			 fis = new FileInputStream("D:\\Capg_Personal\\IO Operations\\src\\com\\IO_Operations\\log1.txt");
			while ((ch = fis.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());

			}
		}
	}

}
