package com.fileHandling11;

import java.io.File;

public class FolderCreation1
{
	public static void main(String[] args)
	{
		String s1  =  "R:\\FileHandling1\\Demos";
		File f=new File(s1);
		if(f.exists())
		{
			System.out.println("Sorry! folder already exits");
		}
		else
		{
			f.mkdir();
			System.out.println("Folder created successfully");
			
		}
	}

}
