package com.IO_Operations;
import java.io.*;
import java.util.*;
public class BufferedOutputStream_Demo {

public static void main(String [] args)
{
		int ch = 0;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		Scanner sc = new Scanner(System.in);
	
		try {
			 fos = new FileOutputStream("D:\\Capg_Personal\\IO Operations\\src\\com\\IO_Operations\\log1.txt");
			  bos = new BufferedOutputStream(fos);
			 System.out.println("Enter Id");
			 int id = sc.nextInt();
			 System.out.println("Enter Customer Name");
			 String name = sc.next();
			 System.out.println(" ");
			 String str =  id+ " " +name;
			
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

