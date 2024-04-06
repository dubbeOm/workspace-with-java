package inheritance;

public class child {
 public int b = 30;
 public void m3() {
	 System.out.println("m3 method of child class");
 }
 public static void main(String[] args) {
	 parent p = new parent();
	   p.m1();
	  child c = new child();
	  c.m3();
 }
public void m10() {
	// TODO Auto-generated method stub
	
}
}
