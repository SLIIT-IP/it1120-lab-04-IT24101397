import java.util.Scanner;
public class IT24101397Lab4Q1 {
   public static void main(String[]argss){
      
       Scanner scanner = new Scanner(System.in);

       // Input a number
       System.out.print("Enter a number: ");
       int number = scanner.nextInt();

      // Check if the number is positive,negative, or zero
      if (number > 0) {
          System.out.println("The number is positive");
      } else if (number < 0) {
          System.out.println("The number is negative");
      } else {
          System.out.println("The number is zero");
      }
      
      scanner.close();
   }
}

      

