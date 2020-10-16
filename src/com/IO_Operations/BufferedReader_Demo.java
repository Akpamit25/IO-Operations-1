package com.IO_Operations;//

import java.io.*;

public class BufferedReader_Demo {

	public static void main(String[] args) {
		int ch = 0;
		String str = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("D:\\Capg_Personal\\IO Operations\\src\\com\\IO_Operations\\log1.txt");
			br = new BufferedReader(fr);
			while ((str = br.readLine()) != null) {
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());

			}
		}
	}

}
