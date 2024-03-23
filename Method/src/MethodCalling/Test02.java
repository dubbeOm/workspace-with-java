package MethodCalling;
public class Test02 {
    public void  m2() {
    	 System.out.println("m2 method of test2 class");
    }
     public static void main(String[] args) {
    	Test01 t1 = new Test01();
    	 t1.m1();
    	 Test02 t2 = new Test02();
       t2.m2();	 
     }
}
