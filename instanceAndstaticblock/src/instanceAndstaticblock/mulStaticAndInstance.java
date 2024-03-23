package instanceAndstaticblock;

public class mulStaticAndInstance {

	{
		System.out.println("Instance Block1");
	}

	{
		System.out.println("Instance Block2");
	}
	static {
		System.out.println("Static Block 1");
	}

	static {
		System.out.println("Static Block 2");
	}

	public static void main(String[] args) {

		StaticAndInstance s = new StaticAndInstance();

		StaticAndInstance s1 = new StaticAndInstance();

	}

}
