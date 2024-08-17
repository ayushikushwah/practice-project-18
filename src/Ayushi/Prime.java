package Ayushi;

public class Prime {

	public static void main(String[] args) {
		
		//2 is the only number which is even and prime
		//prime number starst with 2 so inializing with 2

		int num = 9;
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Number is Prime number");
		} else {
			System.out.println("Number is not Prime number");
		}
		
		
		
//		if (num % 2 == 0)
//			System.out.println("not prime");
//		else
//			System.out.println(" prime");
	}
}
