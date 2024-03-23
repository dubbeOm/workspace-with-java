package MethodCalling;

public class Test04 {
  
	public static void m2() {
		System.out.println("m2 method of Test04 class");
	}
	
	public static void main(String [] args) {
		Test03.m1();
		Test04.m2();
	}
}

