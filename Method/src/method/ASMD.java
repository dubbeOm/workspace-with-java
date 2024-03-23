package method;

import java.util.Scanner;

public class ASMD {
   
	public static int towNoAddition() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter fist number");
			
			int no1 = sc.nextInt();
			System.out.println("Enter second Number");
			int no2 = sc.nextInt();
			
			 int c = no1 + no2;
			  return c;
		}
	}
	
	public static void main(String []args) {
		int result = ASMD.towNoAddition()
;
		System.out.println(result);}

	
}
