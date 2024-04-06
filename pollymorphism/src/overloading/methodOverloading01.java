package overloading;

public class methodOverloading01 {
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}
	public void add( int a , int b, int c) {
		int d = a + b+ c;
		System.out.println(d);
	}
	public void display(String fname, String lastname) {
		System.out.println(fname + "" + lastname);
	}
	public void display( String address, int age) {
		System.out.println(address + "" + age);
	}
	public static void main(String[] args) {
		methodOverloading01 m = new methodOverloading01();
		System.out.println(m.add(22, 33));
		m.add(33,55,66);
		m.display("mohan","pune");
		m.display("pune", 28);
	}
}
