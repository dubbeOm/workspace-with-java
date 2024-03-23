package instanceAndstaticblock;

public class StaicBlock {
    static {
    	System.out.println("Satic Block");
    	
    }
     static {
    	 System.out.println("Static sec block");
     }
     public static void main(String[] args) {
    	 StaicBlock s = new StaicBlock();
     }
}
