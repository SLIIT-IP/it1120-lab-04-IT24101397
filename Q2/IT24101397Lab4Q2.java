import java.util.Scanner;

public class IT24101397Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input exam and lab marks
        System.out.print("Enter exam marks (out of 100): ");
        int examMarks = scanner.nextInt();
        
        System.out.print("Enter lab submission marks (out of 100): ");
        int labMarks = scanner.nextInt();
        
        // Validate the marks
        if (examMarks < 0 || examMarks > 100 || labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
            return;
        }
        
        // Input percentages
        System.out.print("Enter percentage for exam marks: ");
        int examPercentage = scanner.nextInt();
        
        System.out.print("Enter percentage for lab marks: ");
        int labPercentage = scanner.nextInt();
        
        // Validate the percentages
        if (examPercentage + labPercentage != 100) {
            System.out.println("Invalid percentages entered. The total should be 100.");
            return;
        }
        
        // Calculate the final mark
        double finalMark = (examMarks * examPercentage / 100.0) + (labMarks * labPercentage / 100.0);
        
        System.out.println("The final mark is: " + finalMark);
        
        scanner.close();
    }
}