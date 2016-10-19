public class stringMethods
{
	public static void main(String[] args)
	{
		System.out.println(findString("racecar", "car", 0));
		System.out.println(findString("abcabcdabc", "abc", 2));
		System.out.println(findString("abcd", "ef", 1));

		System.out.println(countStrings("racecar", "car"));
		System.out.println(countStrings("abcabcdabc", "abc"));
		System.out.println(countStrings("abcd", "ef"));



	}


	/**
	 * Finds the first instance of s in line,
	 * starting at the position start
	 * @param o the orignal string 
	 * @param s the string to find 
	 * @param start the position to start searching.
	 * Guaranteed to be in the string line. (precondition)
	 * @return the index of the first single instance of
	 * s if the string is found OR -1 if it is not found.
	 */
	public static int findString (String o, String s, int start)
	{  /* To be implemented in part a) */ 

	String sub = o.substring(start, o.length());
	System.out.println(sub);
	if (sub.indexOf(s) > -1)
		return sub.indexOf(s) + start;	
	else
		return sub.indexOf(s);	
	
	}


	/**
	 * Count the number of times instances of s appear in
	 * the line.
	 * @param o the original string
	 * @param s the string to find.
	 * @return the number of times the string appears in the line
	 */
	public static int countStrings (String o, String s)
	{  /* To be implemented in part b) */ 

		if (findString(o, s, 0) >= 0)
		{
			for (int i = 0; i < o.length()/s.length(); i ++)
			{	
				int count = 0;
				String sub = o.substring(o.indexOf(s) + s.length());
				if (findString(o, s, 0) >= 0)
					count ++;
					
			System.out.println(count);
			System.out.println(i);
			
			}	
		return count;

		}
		else
			return 0;
		
	
	}


	/**
	 * Replace all instances of underscores in the line given by
	 * line with italics tags.  There must be an even number of underscores
	 * in the line, and they will be replaced by <I>, </I>, alternating.
	 * @param line a string with 0 or more underscores
	 * @return the line that has underscores replaced with <I> </I> tags or 
	 * the original line if there are not an even number of underscores.
	 */
//	  public static String convertItalics (String line)
//	  {  /* To be implemented in part c) */ }
  
	  /* 
	  Examples:
	  line                             value returned by convertItalics
  
	  "This is _very_ good."           "This is <I>very</I> good."
	  "_This_ is _very_ _good_."       "<I>This</I> is <I>very</I> <I>good</I>."
	  "This is _very good."            "This is _very good."
	  "This is __very good."           "This is __very good." */
	  
	  
	   
}	  
  
  