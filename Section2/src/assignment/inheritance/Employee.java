package com.corejava.assignment.inheritance;

public class Employee
{
	/*single parameterize method - int
    *this method perform operation of searching employee in record by int parameter*/
void Search(int id)
{
	 System.out.println("Id is :"+id);
	 
}


/*single parameterize method -string
*this method perform operation of searching employee in record by int parameter*/
void Search(String Name)
{
	 System.out.println("Name is :"+Name);
}


/*two parameterize method-string and long
*this method perform operation of searching employee in record by int parameter*/
void Search(String Name,long mob)
{
	 System.out.println("Name is: "+Name);
	 System.out.println("Mobile no :"+mob);
}

}
