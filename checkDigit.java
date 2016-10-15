public class checkDigit
{

	public static void main(String[] args)
	{
	
	//check digit tests
		System.out.println(checkDigit("hello"));
		System.out.println(checkDigit("3he4llo"));
		System.out.println(checkDigit("2"));
		System.out.println(checkDigit(""));
		System.out.println("--------------");

		
	//is Palindrome iterative using charAt
		System.out.println(isPalindromeITAT("racecar"));	
		System.out.println(isPalindromeITAT("w"));	
		System.out.println(isPalindromeITAT("weeee"));	
		System.out.println(isPalindromeITAT("121"));	
		System.out.println(isPalindromeITAT(""));	
		System.out.println("--------------");
		
		
	//is Palindrome iterative not using charAt
	// NOT WORKING
		System.out.println(isPalindromeNOAT("racecar"));	
		System.out.println(isPalindromeNOAT("w"));	
		System.out.println(isPalindromeNOAT("weeee"));	
		System.out.println(isPalindromeNOAT("121"));	
		System.out.println(isPalindromeNOAT(""));	
		System.out.println("--------------");
				
		
	//is Palindrome recursive and uses charAt
		System.out.println(isPalindromeREAT("racecar"));
		System.out.println(isPalindromeREAT("w"));
		System.out.println(isPalindromeREAT("weeee"));
		System.out.println(isPalindromeREAT("121"));
		System.out.println(isPalindromeREAT(""));		
		System.out.println("--------------");

	}	
		
		/** 
		 * this method takes in a string and returns true if the given string has a digit 
		 * false otherwise
		 * This algorithm goes through each character and evaluates its ASCII character
		 * @param s the given string to check if it has a digit
		 * @return true if it has a digit, false otherwise
		 */
		public static boolean checkDigit(String s)
		{

			for (int i = 0; i < s.length(); i++)
			{
				if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
					return true;
			}		
				return false;
		}

		/** 
		* This method takes in a String and returns true if the given String is a palindrome.
		* if it is less than 2 chars long, it is automatically a palindrome
		* else: while the length of the word / 2 is less than the number of iterations
		* it checks the character's ascii and increments i by +1
		* @param s the string to check whether it is a palindrome
		* @return boolean true if palindrome, false otherwise
		* ITTERATIVELY WITH CHARAT
		*/

		public static boolean isPalindromeITAT(String s)
		{
			if (s.length() <= 1)
				return true;		
			
			else
			{
  				int n = s.length();
  				for (int i = 0; i < (n / 2); i++) 
     			{	
     				if (s.charAt(i) != s.charAt(n - i - 1)) 
        				return false;
  				}
  				return true;
			}	
		}
		
		public static boolean isPalindromeNOAT(String s)
		{
			if (s.length() <= 1)
				return true;
				
			return s.equals(new StringBuilder(s).reverse().toString());			
			
// 			int i = 0;
// 			int n = s.length() - 1;
// 			
// 			while (n > i)
// 			{	
// 			
// 			}
			
		
		}
		
		
		
				
		
		/** 
		* This method takes in a String and returns true if the given String is a palindrome.
		* each recursion moves towards the center of the word
		* @param s the string to check whether it is a palindrome
		* @return boolean true if palindrome, false otherwise
		* Recursively with use of charAt
		*/


		public static boolean isPalindromeREAT(String s)
		{
			if (s.length() <= 1)
				return true;
			
			else if(s.charAt(0) != s.charAt(s.length() -1))
				return false;

				
			String r = s.substring(1, (s.length() - 1));	
			return isPalindromeREAT(r);
		}



}