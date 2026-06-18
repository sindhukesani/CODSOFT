import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Subjects: ");
        int subjects = sc.nextInt();
        sc.nextLine();

        String[] subjectNames = new String[subjects];
        int[] subjectMarks = new int[subjects];

        int totalMarks = 0;

        for (int i = 0; i < subjects; i++) {

            System.out.print("Enter Subject " + (i + 1) + " Name: ");
            subjectNames[i] = sc.nextLine();

            System.out.print("Enter Marks for " + subjectNames[i] + ": ");
            subjectMarks[i] = sc.nextInt();
            sc.nextLine();

            totalMarks += subjectMarks[i];
        }

        int maxMarks = subjects * 100;

        double percentage = (double) totalMarks / maxMarks * 100;

        char grade;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80)
            grade = 'B';
        else if (percentage >= 70)
            grade = 'C';
        else if (percentage >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n==============================================");
        System.out.println("              STUDENT RESULT");
        System.out.println("==============================================");

        System.out.printf("%-20s %-10s\n", "Subject", "Marks");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-20s %-10d\n",
                    subjectNames[i],
                    subjectMarks[i]);
        }

        System.out.println("----------------------------------------------");
        System.out.println("Obtained Marks : " + totalMarks);
        System.out.println("Total Marks    : " + maxMarks);
        System.out.printf("Percentage     : %.2f%%\n", percentage);
        System.out.println("Grade          : " + grade);
        System.out.println("==============================================");

        sc.close();
    }
}