package com.IO_Operations;
import java.io.*;
public class IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Creating Directory .....");
String dirName = "myDir";
File f1 = new File(dirName);
f1.mkdir(); //creates the directory
System.out.println("Directory "+dirName+" Created");
System.out.println(dirName + (f1.exists() ? " exists. " : " doesn't exists.")); //Checking whether the directory/file exists in the current location or not.
System.out.println(dirName + " is a " +(f1.isFile() ? "file. " : "directory. "));//Checking whether the given file reference is a file or a directory.

	}

}
