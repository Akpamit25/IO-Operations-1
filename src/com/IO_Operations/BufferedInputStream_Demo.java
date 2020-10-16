package com.IO_Operations;

import java.io.FileInputStream;//
import java.io.*;
public class BufferedInputStream_Demo {


	public static void main(String[] args) {
		int ch = 0;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		byte[] buffer = new byte[1024];
		String str = new String();

		try {
			 bis = new BufferedInputStream(new FileInputStream("D:\\Capg_Personal\\IO Operations\\src\\com\\IO_Operations\\log1.txt"));
			while ((ch = bis.read()) != -1) {
				//str = new String(buffer,0,ch);
				//System.out.print(str);
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				bis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());

			}
		}
	}

}
