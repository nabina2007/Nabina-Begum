import java.util.Scanner;
   public class leapyear {
      public static void main (String[]args) {
                   Scanner scanner=new Scanner(System.in);
                   System.out.println("Enter the year:");
		   int num=scanner.nextInt();
                   
                   if (num%4==0){
			System.out.println("The year is leap year");

		   }else {
			System.out.println("The year is not leap year");
  		}
        }
}


 