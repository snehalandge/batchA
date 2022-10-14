package pkg1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String a="arc";
		String b="car";
		
		if(a.length() == b.length())
		{
			char k[]=a.toCharArray();
			char k1[]=b.toCharArray();
			
			Arrays.sort(k);
			
			Arrays.sort(k1);
			
			if(Arrays.equals(k, k1))
			{
				System.out.println("given words are an anagram");
				
				
			}
			
			else
			{
				System.out.println("given words are not an angrams but have same length");
				
			}
			
			
			
		}
		else System.out.println("given words are not an anagrams");
	}

}
