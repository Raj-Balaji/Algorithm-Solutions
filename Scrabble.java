package scrabble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Scrabble {
	
	
	public static Map<String,Integer> createMap(String[] words)
	{
		Map<String,Integer> map = new HashMap<>();
		for(String s: words)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
				map.put(s, 1);
		}
		return map;
	}
	
	
	public static void main(String args[])
	{
		
		String[] words = {"h","t","r","e","t","a","i"};
		
		Map<String,Integer> map = createMap(words);
		// h -> t ->r ->e ->t -> a -> i
		// height
		// high
		// hello
		ArrayList<String> wordList = new ArrayList<>();
		
		Set<String> invalidWords = new HashSet<>();
		Map<String,Integer> wordChecker = new HashMap<>();
		// 
		wordList.add("hatteri");			// valid word
		wordList.add("hattrick");		// not valid
		wordList.add("height");			// not valid
		wordList.add("high");			// valid
		wordList.add("her");			// valid
		ArrayList<String> validWords = new ArrayList<>();
		//for(int i=0;i<words.length;i++)
		//{
			// wordlist = dictionaryStartsWith( words[i])
			
			for(int i=0; i<wordList.size();i++)
			{
				boolean validity=true;
				wordChecker = createMap(words);
				
			
				String word = wordList.get(i);
		
				System.out.println("Checking word :"+word);
				for(int j=0;j<word.length();j++)
				{
					String letter = word.substring(j,j+1);
					if(wordChecker.containsKey(letter))
					{
						if(wordChecker.get(letter)>0 )
						{
							wordChecker.put(letter,wordChecker.get(letter)-1);
						}
						else
						{
							validity=false;
							break;
						}
							
					}
					else
					{
						validity=false;
						break;
					}	
				}
				if(validity)
				{
					validWords.add(word);
					System.out.println("Valid word:"+word);
				}
				
				
				/*
				 * Messy Code
				for(Entry<String,Integer> entry: tempMap.entrySet())
				{
					//System.out.println(tempMap.get("h"));
					System.out.println(wordList.get(s).charAt(j));
	
					if( tempMap.containsKey( wordList.get(s).charAt(j)+"" )    )
					{
					
						
						if(tempMap.get(wordList.get(s).charAt(j)+"" )>0 )
						{
							System.out.println("Letter "+wordList.get(s).charAt(j)+" is in " + wordList.get(s));
							tempMap.put(wordList.get(s).charAt(j)+"", tempMap.get(wordList.get(s).charAt(j)+"" )-1 );
							j++;
						}
						else 
						{
							invalidWords.add(wordList.get(s));
							break;
						}
						
					}
					else 
					{
						invalidWords.add(wordList.get(s));
						break;
					}
				
				}*/
	
			}

		//}
			/*
		for(String i: invalidWords)
		{
			
			System.out.println(i);
		}*/
		
	
	}
}