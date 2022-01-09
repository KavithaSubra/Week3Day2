package Week3.Day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


	// Input: "PayPal India"
	// Output:PaylIndi

	public class RemoveDuplicates {

		public static void main(String[] args) {		
			
//			Declare a String as PayPal India
			
			String s = "Paypal India";			

//			Convert it into a character array

			char[] charArray = s.toCharArray();
			
//			Declare a Set as charSet for Character
			Set<Character> charSet = new HashSet<Character>();

//			Declare a Set as dupCharSet for duplicate Character
			Set<Character> dupCharSet = new HashSet<Character>();

//			Iterate character array and add it into charSet
			
//			if the character is already in the charSet then, add it to the dupCharSet
			
			for(char eachChar: charArray)
			{
				boolean add = charSet.add(eachChar);
				if(!add)
				{
					dupCharSet.add(eachChar);
					}
				
				}
			System.out.println(dupCharSet);
			
//			Check the dupCharSet elements and remove those in the charSet		
			charSet.removeAll(dupCharSet);
			System.out.println(charSet);
			}
		
		
	}

