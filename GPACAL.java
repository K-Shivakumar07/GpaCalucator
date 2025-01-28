import java.util.Scanner;

public class GPACAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalGradePoints = 0;
        double totalCreditHours = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the grade for subject " + i + " (e.g., 4.0 for A, 3.0 for B, etc.): ");
            double grade = scanner.nextDouble();

            System.out.print("Enter the credit hours for subject " + i + ": ");
            double creditHours = scanner.nextDouble();

            totalGradePoints += grade * creditHours;
            totalCreditHours += creditHours;
        }

        if (totalCreditHours == 0) {
            System.out.println("Total credit hours cannot be zero.");
        } else {
            double gpa = totalGradePoints / totalCreditHours;
            System.out.printf("Your GPA is: %.2f\n", gpa);
        }

        scanner.close();
    }
}
