package com.IO_Operations;//

import java.io.*;
import java.util.*;

public class BufferedWriter_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		int ch = 2;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			 fw = new FileWriter("D:\\Capg_Personal\\IO Operations\\src\\com\\IO_Operations\\log1.txt",true);
			 bw = new BufferedWriter(fw);
			 
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter Product Id");
			 String id = sc.next();
			 System.out.println("Enter Product Price");
			 int price = sc.nextInt();
			 			 
			 String str =  "Product Id : "+ id + " Product Price " +price;
			 System.out.println(str);
			bw.write(str);
		bw.flush();
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
