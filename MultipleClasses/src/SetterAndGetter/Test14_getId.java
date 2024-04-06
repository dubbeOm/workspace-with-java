package SetterAndGetter;

public class Test14_getId {
    public static void main(String [] args) {
    	Thread th1 = new Thread();
    	Thread th2 = new Thread();
    	
    	 System.out.println("th1 name and id:" + th1.getName() + " " + th1.getId());
    	 System.out.println("th2 name and Id:" + th2.getName() + " " + th2.getId());
    	 
    	 
    	  th1.setName("Child1");
    	  th2.setName("Child2");
    	   
    	   System.out.println("\nth1 name and id: " +th1.getName() + " " + th1.getId());
    	   
    
    	   System.out.println("\nth2 name and id: " +th2.getName() + " " + th2.getId());
    
      th2.setName("Child1");
      
       System.out.println("\nth1 name and id: "+ th1.getName() + "  "+ th1.getId());
   		System.out.println("th2 name and id: "+ th2.getName() + "  "+ th2.getId());
    
      System.out.println("main end");
    }
    
}
