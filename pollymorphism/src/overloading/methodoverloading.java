package overloading;

public class methodoverloading {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	public void add( int a , int b, int c) {
		int d = a + b+ c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		methodoverloading m = new methodoverloading();
		m.add(30,45);
		m.add(40,50,66);
	}
}
