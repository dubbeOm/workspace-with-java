package SetterAndGetterMethod;

public class test01 {
	public static void main(String[] args) {

		NewStudent stu1 = new NewStudent();
		stu1.setRollno(11);
		stu1.setName("Santosh");
		stu1.setAddr("Pune");

		System.out.println(stu1.GetRollno());
		System.out.println(stu1.getName());
		System.out.println(stu1.getAddr());
	}

}
