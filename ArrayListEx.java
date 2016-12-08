/**
 * ArrayList Examples
 * @author Ami Gianchandani
 * December 8, 2016
 * Classwork
 */


import java.util.ArrayList;

public class ArrayListEx
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println(a.size());
		
		a.add(3);
		a.add(4); 
		
		System.out.println(a.size());
		System.out.println(a);
	
		Integer i = new Integer(5);
		a.add(i);
		System.out.println(a.size());
		System.out.println(a);
		i = 6;
		//a.add(i)
		System.out.println(i);
		System.out.println(a);
		a.add(0, -3);  //a.add appends to end of list, unless given index (0)
		System.out.println(a);
		a.set(a.size()-1, 6);  //a.set replaces
		System.out.println(a);
		
		a.add(a.size(), 1);
		System.out.println(a);
		
		//a.set(9, -2) //runtime error index out of range
		
		System.out.println(a.size());
		System.out.println(a);

		a.remove(0); //removes 0th index
				
		System.out.println(a.size());
		System.out.println(a);
		
		System.out.println();
		
		
		
		ArrayList<Integer> aL = new ArrayList<Integer>();
		aL.add(2);
		aL.add(2);
		aL.add(0);
		aL.add(-2);
		aL.add(4);
		aL.add(2);
		
		removeNum(aL, 3);
		
		System.out.println(a);
		
		System.out.println();
		
		ArrayList<String> arrL = new ArrayList<String>();
		arrL.add("eye");
		arrL.add("abc");
		arrL.add("elephant");

		replaceEX(arrL);
		System.out.println(arrL);
		
	}
	
	/**
	 * Takes in array list of integers and an int and removes all occurrences of that int
	 * from the array list
	 * @param ArrayList of integers
	 * @param int n
	 */
	
	public static void removeNum (ArrayList<Integer> a, int n)
	{
		for (int i = 0; i < a.size(); i ++)
		{
			if (a.get(i) == n)
			{
				a.remove(i);
			}
		}	
	}

	/**
	 * Takes in array list of strings and replaces all occurrences of character 'e' 
	 * with 'x' in the Strings in the array list
	 * @param ArrayList string
	 */
	
	public static void replaceEX(ArrayList<String> a)
	{
		for (int i = 0; i < a.size(); i ++)
		{
			String s = "";

			for (int j = 0; j < a.get(i).length(); j ++)
			{
				if (a.get(i).substring(j, j+1).equals("e"))
				{
					s += "x";
				}
				else
				{
				 	s += a.get(i).substring(j, j+1);
				}
			}
		a.set(i, s);
		
		}
	}




}