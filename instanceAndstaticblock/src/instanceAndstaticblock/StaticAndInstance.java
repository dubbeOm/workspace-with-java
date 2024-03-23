package instanceAndstaticblock;

public class StaticAndInstance {
	{
	System.out.println("instance block");
	}
	static{
		System.out.println("Static block");
	}
	public static void main(String [] args) {
		StaticAndInstance n = new StaticAndInstance();
		
		StaticAndInstance s1 = new StaticAndInstance();
	}
}
