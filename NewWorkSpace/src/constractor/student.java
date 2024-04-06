//constrctor :  constractor are spacial method used to intialize object. there are sevral
//types of constractor based on their usage and parameters .
// there are two types of constractor
//1)default constractor:
     //
//2) parametrized constractor:- these constractor takes parametes, allowint you to 
//intialize instance variable with spacific values when an object is created.
//



package constractor;

public class student {
   int rollno;
   String name;
   
public student(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}
//   public student() {
//	   
//	   System.out.println("constracor called");
//   }
    public String toString() {
    	return "student [ rollno =" + rollno + " name= " + name + "]";
    }
	public static void main(String[] args) {
		student stu = new student(33, "mohan");
		System.out.println(stu.toString());
		student stu1 = new student(44,"satish");
		System.out.println(stu1.toString());
		// TODO Auto-generated method stub

	}

}
