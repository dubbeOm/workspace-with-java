package Method;
                    //Method will take any argument/parameter and  return result
public class ASMD01 {
	public int twoNoAddition(int a, int b) {

		int c = a + b;
		return c;

	}

	public static void main(String[] args) {

		ASMD asmd = new ASMD();
		int result =  asmd.twoNoAddition();
		System.out.println(result);
	}

}
