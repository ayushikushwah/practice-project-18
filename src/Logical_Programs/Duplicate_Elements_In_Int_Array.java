package Logical_Programs;

public class Duplicate_Elements_In_Int_Array {

	public static void main(String[] args) {
		
		
		int ar[] = {10,11,12,11,13,14,07,14};		
		int count=0;
		
		for(int i=0;i<=ar.length;i++)
		{
			for(int j= i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					System.out.println(ar[i]+" ");
				}
			}
		}

	}

}
