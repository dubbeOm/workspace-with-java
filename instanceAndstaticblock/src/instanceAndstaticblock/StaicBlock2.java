package instanceAndstaticblock;

public class StaicBlock2 {

	static {
		System.out.println("Static Block");
	}
	
	static {
		System.out.println("static Block");
	}

	public static void main(String[] args) {

		StaicBlock2 s = new StaicBlock2();
		
	
	}

}
