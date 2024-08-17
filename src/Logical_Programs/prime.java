package Logical_Programs;

public class prime {

	public static void main(String[] args) {
		
		int num =4;
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
		
			}
		}
		
		if(count ==0)
		{
			System.out.println("num is prime");
		}
		
		else
		{
			System.out.println("num is not prime");
		}
		

	}

}
