package Object;

public class Student {
	int rollno;

	String name;

	String address;

	public static void main(String[] args) {

		Student stu1 = new Student();
		stu1.rollno = 11;
		stu1.name = "Santosh";
		stu1.address = "Pune";

		System.out.println(stu1.rollno);
		System.out.println(stu1.name);
		System.out.println(stu1.address);

		Student stu2 = new Student();
		stu2.rollno = 22;
		stu2.name = "Ganesh";
		stu2.address = "Beed";

		System.out.println(stu2.rollno);
		System.out.println(stu2.name);
		System.out.println(stu2.address);
	}

}
