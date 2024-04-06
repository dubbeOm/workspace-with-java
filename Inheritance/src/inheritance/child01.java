package inheritance;

public class child01 {
public int b = 20;

 public void m10() {
	 System.out.println("m2 method of child class");
 }
 public static void main(String[] args) {
	 parentClass p = new parentClass();
	  p.m1();
	  p.m2();
	  p.m3();
	  p.m4();
	  p.m5();
	  
	  child01 c = new child01();
	  c.m10();
 }
}
