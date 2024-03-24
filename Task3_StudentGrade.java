import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3_StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the number of subjects:");
            int numOfSubjects = scanner.nextInt();

            int totalMarks = 0;
            for (int i = 1; i <= numOfSubjects; i++) {
                System.out.println("Enter marks obtained in subject " + i + ":");
                int marks = scanner.nextInt();
                totalMarks += marks;
            }

            double averagePercentage = (double) totalMarks / numOfSubjects;

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage);

            int grade = calculateGrade(averagePercentage);
            System.out.print("Grade: ");
            displayGrade(grade);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integer values for marks.");
        } finally {
            scanner.close();
        }
    }

    public static int calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 1;
        } else if (averagePercentage >= 80) {
            return 2;
        } else if (averagePercentage >= 70) {
            return 3;
        } else if (averagePercentage >= 60) {
            return 4;
        } else if (averagePercentage >= 50) {
            return 5;
        } else {
            return 6;
        }
    }

    public static void displayGrade(int grade) {
        switch (grade) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            case 6:
                System.out.println("F");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}
