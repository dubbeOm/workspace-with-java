package instanceAndstaticblock;

public class StaticBlock {
	static {
		System.out.println("Static Block");
	}

	public static void main(String[] args) {

		StaticBlock s = new StaticBlock();
		
		StaticBlock s1= new StaticBlock();
	}

}
