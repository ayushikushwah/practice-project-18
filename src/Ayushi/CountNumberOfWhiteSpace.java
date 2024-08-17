package Ayushi;

public class CountNumberOfWhiteSpace {

	public static void main(String[] args) {
		
		//we will get character by using charAt method
		//just use for loop and get charAt(i) in char type temp variable
		//now check if temp is euqla to whitespace if yes then count++
		//and outside for loop  ..just print the count
		int count = 0;
		String ar = "A yushi K";
		
		for(int i=0;i<ar.length()-1;i++)
		{
			char temp = ar.charAt(i);
			if(temp==' ')
			{
				count++;
			}
			
			
		}
		System.out.println(count);

	}

}
