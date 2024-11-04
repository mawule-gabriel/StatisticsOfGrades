import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        GradeStatistics gradeStats = new GradeStatistics(numStudents);
        gradeStats.initializeScores();
        gradeStats.calculateStats();

        System.out.println("Maximum Grade: " + gradeStats.getMaximumGrade());
        System.out.println("Minimum Grade: " + gradeStats.getMinimumGrade());
        System.out.printf("Average Grade: %.2f%n", gradeStats.getAverageGrade());

        int[] stats = gradeStats.getStats();
        System.out.println("Grades below 40: " + stats[0]);
        System.out.println("Grades 41-60: " + stats[1]);
        System.out.println("Grades 61-80: " + stats[2]);

        scanner.close();
    }
}
