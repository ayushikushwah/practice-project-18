package Logical_Programs;

public class ShiftZeroToLeft {

	public static void main(String[] args) {
		int ar[]= {1,2,0,3,0,4,5,0,6,7,0};//{1,2,3,4,5,6,7,0,0,0,0}
		int index=0;
		
		int br[] =new int[ar.length];
		for(int i=0;i<=ar.length-1;i++)
		{
			if(ar[i]==0)
			{
				index++;
			}
		}
		
		for(int j=0;j<=br.length-1;j++)
		{
			if(ar[j]!=0)
			{
				br[index] =ar[j];
				index++;
			}
			System.out.print(br[j]+" ");
		}

	}

}
