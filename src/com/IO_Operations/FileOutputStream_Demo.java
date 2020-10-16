package com.IO_Operations;//

import java.io.*;//

public class FileOutputStream_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		int ch = 0;
		FileOutputStream fos = null;
		String str = "This is my Output Stream";
		// String f = "D:\\Capg_Personal\\IO
		// Operations\\src\\com\\IO_Operations\\log1.txt";
		try {
			 fos = new FileOutputStream(
					"D:\\Capg_Personal\\IO Operations\\src\\com\\IO_Operations\\log1.txt", true);
			byte barr[] = str.getBytes();
			fos.write(barr);
			fos.flush();
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
