package SetterAndGetterMethod;

public class student {
  private int rollno;
   private String name;
    
   private String addr;
   
   private int phoneNo;
   
   public static void main(String [] args) {
	    student s1 = new student();
	    s1.rollno = 22;
	    s1.name = "amar";
	    s1.addr = "parbhani";
	    s1.phoneNo = 90184343;
	    
	    System.out.println(s1.rollno);
	    System.out.println(s1.name);
	    System.out.println(s1.addr);
	    System.out.println(s1.phoneNo);
	    
	    student s2 = new student();
	    
	    s2.rollno = 33;
	    s2.name = "mohan";
	    s2.addr = "parali";
	    s2.phoneNo = 7262343;
	    
	    System.out.println(s2.rollno);
	    System.out.println(s2.name);
	    System.out.println(s2.addr);
	    System.out.println(s2.phoneNo);
   }
}
