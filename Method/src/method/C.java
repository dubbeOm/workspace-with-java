package method;

public class C {

	public  static void m3() {
		System.out.println("m3 method of C class");
		B.m2();
	}
	
	public static void main(String[] args) {
		
		C.m3();
	}

}
