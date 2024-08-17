package Ayushi;

public class OccuranceOfCharInString {

	public static void main(String[] args) {


		String a = "radarrrr";
		int count = 0;
		
		for(int i=0;i<=a.length()-1;i++)
		{
			char temp ='r';
			if(a.charAt(i) == temp)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
