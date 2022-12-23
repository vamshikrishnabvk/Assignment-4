package assign4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="iNeuron";
		String s2="urEoniN";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length())
		{
			char[] arr1=s1.toCharArray();
			char[] arr2=s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean result=Arrays.equals(arr1, arr2);
			if(result)
			{
				System.out.println( s1  + " and " + s2 + " are anagrams ");
			}
			else
				System.out.println("are not anagrams");
		}
		else
			System.out.println("length is not equal hence they are not anagrams");
	}

}

