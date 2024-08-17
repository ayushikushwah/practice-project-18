package Ayushi;

public class CommonString {
	public static void main(String[] args) {
		String s1 ="Tendulkar"; 
		String s2 ="Gavaskar";
		int count =0;
		String s3="";
		
		//max common string
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		//loop for 1st string
		for(int i=0;i<=s1.length()-1;i++)
		{
			char temp = s1.charAt(i);
			//loop for 2nd string 
			for(int j=0;j<=s2.length()-1;j++)
			{
				//comparing the elements of 1st and 2nd string
				if(temp == s2.charAt(j))
				{
					if(!s3.contains(Character.toString(temp)))
					{
						s3 = s3+temp;
					}
				}
				
			}
			
		}
		System.out.print(s3);
		
		
	}

}
