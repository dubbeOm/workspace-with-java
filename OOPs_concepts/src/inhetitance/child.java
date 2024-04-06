package inhetitance;

 class child  extends parent{
   public void m2() {
	   System.out.println("m2 method of child class");
   }
   
   public static void main(String[] args) {
	   child c = new child();
	      c.m2();
	      
	      parent p = new parent()
;
	      p.m1();
	     }
}
