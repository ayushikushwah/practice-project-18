package Ayushi;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindLargestAndSmallestNumber {

	public static void main(String[] args) {
		
		int a[] = {12,13,4,7,9,10,100,28};
		
		//add to treeset to sort them in asceding order
		 TreeSet<Integer> tr = new TreeSet<Integer>();
		 //add elements of array to treeset using for loop
		 for(int i =0;i<a.length;i++)
		 {
			 tr.add(a[i]);
		 }
		 
		 System.out.println(tr);
		 //convert treeset to arraylist as we cannot get() elements of treeset
		 ArrayList<Integer> ar =new ArrayList<Integer>(tr);
		 System.out.println(ar);
		 
		 //smallest number
		 int smallest = ar.get(0);
		 System.out.println(smallest);
		 
		 //second smallest number
		 int secSmallest = ar.get(1);
		 System.out.println(secSmallest);
		 
		 //largest number
		 int largest = ar.get(ar.size()-1);
		 System.out.println(largest);
		 
		 //second largest
		 int secLargest = ar.get(ar.size()-2);
		 System.out.println(secLargest);
		 
		 
	}

}
