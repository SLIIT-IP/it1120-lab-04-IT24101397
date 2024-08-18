import java.util.Scanner;

public class IT24101397Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive, negative, or zero using the ternary operator
        String result = (number > 0) ? "The number is Positive." : 
                        (number < 0) ? "The number is Negative." : 
                        "The number is Zero.";
        
        System.out.println(result);
        
        scanner.close();
    }
}