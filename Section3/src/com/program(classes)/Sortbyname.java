package com.corejava3;

import java.util.Comparator;

public class Sortbyname implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2)
	{
	 Nonprimitivearraysorting n1=(Nonprimitivearraysorting)obj1;
	 Nonprimitivearraysorting n2= (Nonprimitivearraysorting)obj2;
		return n1.name.compareTo(n2.name);
	}

}
