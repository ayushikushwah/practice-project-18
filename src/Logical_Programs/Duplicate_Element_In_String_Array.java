package Logical_Programs;

public class Duplicate_Element_In_String_Array {
	
	public static void main(String[] args) {
		
		int count = 0;
		String ar[]= {"a","b","c","d","a"};
		
		for(int i=0;i<=ar.length;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i].equalsIgnoreCase(ar[j]))
				{
					count++;
					System.out.println(ar[i]+" ");
				}
			}
		}
	}

}
