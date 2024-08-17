package Ayushi;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class prac2 {

	public static void main(String[] args) {
		String str = "abcxyzabclmnlmnpqrabcpqr";
		HashMap<Character , Integer> hs = new HashMap<Character ,Integer>();
		
		//loop of string 
		for(int i =0;i<=str.length()-1;i++)
		{
			char temp = str.charAt(i);
			if(hs.containsKey(temp))
			{
				hs.put(temp, hs.get(temp)+1);
			}
			else {
				hs.put(temp, 1);
			}
		}
		
		System.out.println(hs);
		
	   Set<Entry<Character,Integer>>set	=hs.entrySet();
	   
	   for(Entry<Character ,Integer>s: set)
	   {
		   System.out.println(s.getKey()+":"+s.getValue());
	   }
		
		
		
		
	}
}
