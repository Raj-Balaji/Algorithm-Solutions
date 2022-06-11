package firstRecurringCharacter;

import java.util.HashSet;
import java.util.Set;

// Given a string, find the 1st recurring character in that string


public class FirstRecurringCharacter {

	
	public static Character search(String str)
	{
		
		char[] arr = str.toCharArray();
		
		Set<Character> set = new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
				return arr[i];
			else 
				set.add(arr[i]);
		}
		
		return null;
	}
		
	
	public static void main(String args[])
	{
		
		String  s1 = "ABCA",  // should return A
				s2 = "BCABA", // should return B -> as it appears before A
				s3 = "ABC",	// should return null
				s4 ="ABBA"; // should return B, since B recurs immediately after and A recurs at the end
		System.out.println(search(s1));
		System.out.println(search(s2));
		System.out.println(search(s3));
		System.out.println(search(s4));
		
		
	}
	
}
