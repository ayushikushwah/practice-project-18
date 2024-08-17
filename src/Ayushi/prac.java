package Ayushi;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class prac {

	public static void main(String[] args) {
		
		String a = "abc xyz abc dye abx xyz xml yqp ndz dye";
		String ar [] = a.split(" ");
		
		HashMap<String,Integer> hs = new HashMap<String ,Integer>();
		
		hs.put("ayu", 1);
		System.out.print(hs);
		System.out.print(hs.get("ayu"));//get() takes key as an argument and returns the value
		System.out.print(hs.entrySet());//entrySet() returns the key value pairsof map in set format
		
		//loop of array
		for(int i=0;i<=ar.length-1;i++)
		{
			//storing each element of string in char type variable
			String temp = ar[i];
			if(hs.containsKey(temp))
			{
				hs.put(temp, hs.get(temp)+1);//key , value+1
			}
			else {
				hs.put(temp, 1);
			}
			
			
		}
		System.out.print(hs);
		Set<Entry<String, Integer>> hi = hs.entrySet();
		
		//print values of map
		System.out.println();
		
		for(Entry<String, Integer> ayu:hi)
		{
			
			System.out.println(ayu.getKey()+":"+ayu.getValue());
		}
		
	}

}
