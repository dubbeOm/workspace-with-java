package library;

 // class : it is collection of variable , method , object 
//class : It is keyword .It is used to create class.
//Class Name always starts with Capital letter.
//Body : The class body surrounded by { }.


public class Animal {
   
	String animal = "lion"; // this is variable 
	
       public void eat() // this is method
	 {
		 System.out.println("eat some meet");
	 }
	  
	 public static void main(String [] args) {
		 Animal a = new Animal();// object
			a.eat();

	 }
}
