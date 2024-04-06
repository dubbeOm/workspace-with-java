package multilevelInhetitance;

class child3 extends parent01{
	public void m3() {
		System.out.println("m3 method of Chidl2 class");
	}
	
	public static void main(String[] args) {
		 Child3 c2 =new child3();
		 c2.m1();
		 c2.m2();
		 c2.m3();
	}

}
