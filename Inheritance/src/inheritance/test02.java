package inheritance;


public class test02 extends test01{

	public int b = 20;

	public void m2() {
		System.out.println("m2 method of Child class");
	}

	public static void main(String[] args) {
		 test01 n = new test01();
		 n.m3();
		 System.out.println(n.x);
//	       n.m2();
//	       System.out.println(n.b);
		 
		 test02 t = new test02();
		  t.m2();
		  System.out.println(t.b);
	}
}
