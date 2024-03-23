package MethodCalling;

public class Demo2 {
  public void m2() {
	    System.out.println("m2 method executed  is statrded");
	    System.out.println("m2 method of demo2 class");
    
          Demo1 d1 = new Demo1();
          d1.m1();
          System.out.println("m2 method execution is ended ");
  
  }  
   public static void main(String[] args) {
	   Demo2 d2 = new Demo2();
	   d2.m2();
   }
  
}