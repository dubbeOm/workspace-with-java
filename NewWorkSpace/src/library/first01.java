package library;

public class first01 {
	public static void main(String[] args){
        int n = 5;
       //upper half

         for(int i = 1; i<=n; i++){
            //1st part start
              for(int j = 1; j<=i; j++){
                System.out.println("*");
              }

              int spaces = 2 * (n-i);
              for(int j=1; j<= spaces; j++){
                System.out.println(" ");
              }

              //2nd start
             for(int j = 1; j<=i; j++){
                System.out.println("*");
             }

             System.out.println();
            }

            //lower part

            for(int i = n; i<=1; i++){
               //1st part start
              for(int j = 1; j<=i; j++){
                System.out.println("*");
              }

              int spaces = 2 *(n+i);
              for(int j=1; j<= spaces; j++){
                System.out.println(" ");
              }

              //2nd start
             for(int j = 1; j<=i; j++){
                System.out.println("*");
             }

             System.out.println();
            }  }
}
