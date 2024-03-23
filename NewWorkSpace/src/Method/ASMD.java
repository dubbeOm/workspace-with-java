package Method;

public class ASMD {  //Method will not take any argument/parameter and not return result.


	public int twoNoAddition() {
		int a = 20;
		int b = 10;
		int c = a + b;
		System.out.println(c);
		return c;
		

	}

	public static void main(String[] args) {

		ASMD asmd = new ASMD();
		asmd.twoNoAddition();

	}

	public void twoNoAddition(int i, int j) {
		// TODO Auto-generated method stub
		ASMD asmd = new ASMD();
		asmd.twoNoAddition(10, 20);
		
	}

}
