import java.util.Scanner;
   public class largestnumber {
      public static void main (String[]args) {
                   Scanner scanner=new Scanner(System.in);

		   System.out.print("Enter first number:");
		   int a= scanner.nextInt();

                   System.out.print("Enter second number:");
		   int b = scanner.nextInt();

                   System.out.print("Enter third number:");
		   int c = scanner.nextInt();

      if (a>b & a>c){
          System.out.print("The largest number is "+a);
      }else if (b>c & b>a){
          System.out.print("The largest number is "+b);
      } else{
          System.out.print("The largest number is "+c);
    }
  }
}