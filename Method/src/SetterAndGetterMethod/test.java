package SetterAndGetterMethod;

public class test {
   private int rollno;
   private String name;
   
   private String addr;
   
   public static void main( String[] args) {
	   test t1 = new test();
	   t1.rollno = 11;
	   t1.name = "omkar";
	    t1.addr = "sadegaon";
	    
	    System.out.println(t1.rollno);
	    System.out.println(t1.name);
	    System.out.println(t1.addr);
   }
}
