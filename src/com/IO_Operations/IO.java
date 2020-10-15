package com.IO_Operations;

import java.io.*;;

public class IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating Directory .....");
		String Name = "myDir";
		File f1 = new File(Name);
		f1.mkdir(); // creates the directory
		System.out.println("Directory " + Name + " Created");
		System.out.println(Name + (f1.exists() ? " exists. " : " doesn't exists.")); // Checking whether the
																						// directory/file exists in the
																						// current location or not.
		System.out.println(Name + " is a " + (f1.isFile() ? "file. " : "directory. "));// Checking whether the given
																						// file reference is a file or a
																						// directory.
		System.out.println("-----------------");
//UC2 : Usage of various methods like getName() , isDirectory() .
//Creating file inside directory

		Name = "example.txt";
		File f3 = new File(f1, Name);
		try {
			f3.createNewFile();
			System.out.println(f3.getName() + " Is Created.");
		} catch (IOException e) {
			System.out.println(f3.getName() + " Not Created.");

		}

		if (f1.isDirectory()) {
			String[] content = f1.list();
			System.out.println("The Content Of This Diretory :");
			for (int i = 0; i < content.length; i++) {
				System.out.println(content[i]);
			}
		}
		System.out.println("-------------------");

	
	//UC3 : Using Various Other Methods
	
	if(f1.canRead())
	{
		System.out.println(f1.getName()+ " Is readable");
	}
	System.out.println(f1.getName() + " is " +f1.length()+ " bytes long.");
	System.out.println(f1.getName() + " was modified "+f1.lastModified()+" milliseconds away.");
	
	//deleting directory
	f1.delete();
	System.out.println(f1.getName() + " is deleted.");

}//
}
