//private
// default
// protected
//public
  // we can use access modifier with class , method and variables
//out of the above modifier class level access modifier are 
//1) default
//2) public




package DefaultAccessModifires1;

public class call01 {
  int a = 20;
   void m2() {
	   System.out.println("m2 method of call01 class");
	   
   }
     public static void main(String[]args) {
    	 call01 c1 = new call01();
    	 System.out.println(c1.a);
    	 c1.m2();
     }

}
