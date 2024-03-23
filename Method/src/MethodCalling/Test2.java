package MethodCalling;

public class Test2 {
    public static void m2() {
    	System.out.println("m2 method of Test2 class");
    	Test1.m1();
    }
    public static void main(String[] args) {
    	 Test2.m2();
    }
}
