package com.IO_Operations;//

import java.io.*;

public class FileReader_Demo {

	public static void main(String[] args) {
		int ch = 0;
		FileReader fr = null;//

		try {
			 fr = new FileReader("D:\\Capg_Personal\\IO Operations\\src\\com\\IO_Operations\\log1.txt");
			while ((ch = fr.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());

			}
		}
	}

}
