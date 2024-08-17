package Logical_Programs;

public class RemoveVowels {
	public static void main(String[] args) {
		
		String s = "Apple";
		String z = "";
		
		s =  s.toLowerCase();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char temp = s.charAt(i);
			
			if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u')
			{
				continue;
			}
			
			z = z+temp;
		}
		
		System.out.print(z);
	}

}
