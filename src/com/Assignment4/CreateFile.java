package com.Assignment4;

import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;

public class CreateFile {
	
	public static void main(String[] args)
	{  
		try
		{
		File file=new File("Sravani.txt");
		if(!file.exists())
		{
			file.createNewFile();
		}
			PrintWriter pw= new PrintWriter(file);
			pw.println("this is my file content");
			pw.println("I am sravani");
			pw.println("Working in Zemoso");
			pw.println("I am from Hyderabad");
			pw.println("I am doing my learnings");
			pw.close();
			
			System.out.println("Data has been writed to sravani.txt file");
			
			BufferedReader br=null;
			br=new BufferedReader(new FileReader("Sravani.txt"));
			String line;
			while((line=br.readLine())!=null)
				System.out.println(line);
			br.close();
			
			System.out.println("File name: " +file.getName());
		      System.out.println("Absolute path: " + file.getAbsolutePath());
		      System.out.println("Writeable: " + file.canWrite());
		      System.out.println("Readable " + file.canRead());
		      System.out.println("File size in bytes " + file.length());
			
			
			
			
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}			


}
