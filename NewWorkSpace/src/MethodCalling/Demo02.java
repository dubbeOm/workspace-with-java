package MethodCalling;

public class Demo02 {
	public void m1() {
		System.out.println("m1 method of Demo1 class");
	}

	public static void main(String[] args) {

		Demo02 d2 = new Demo02();
		d2.m1();
	}

}
