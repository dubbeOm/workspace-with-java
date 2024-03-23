package TypeofClasses;

public class Animal {
	String animalName="LION";  // variable
	
	public void eat() { // method
		System.out.println("LION is eating");
	}
	
	
	public static void main(String[] args) {
		
		Animal a=new Animal();// object
		a.eat();
	}
}
