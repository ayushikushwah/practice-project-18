package Logical_Programs;

public class ShiftZeroToRight {

	public static void main(String[] args) {
		int ar[]= {1,2,0,3,0,4,5,0,6,7,0};//{1,2,3,4,5,6,7,0,0,0,0}
		int index=0;
		
		int br[] = new int[ar.length];
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(ar[i]!=0)
			{
				br[index]=ar[i];
				index++;
			}
		}
		
		for(int j=0;j<=br.length-1;j++)
		{
			System.out.print(br[j]+" ");
		}

	}

}
