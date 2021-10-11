package com.corejava3;

public class ArrayDemodouble 
{
 public static void main(String[] args) {
	int [][]b=new int[2][3];
	
	b[0][1]=50;
	b[1][0]=60;
	b[1][2]=70;
	System.out.println(b[1][2]);
	System.out.println(b[1][1]);
	
	row:for(int i=0;i<b.length;i++)
	{
	column:for(int j=0;j<b[i].length;j++)
	{
		System.out.print(b[i][j]+ " ");
	}
	System.out.println();
	}
	
}
}
