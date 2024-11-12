import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        while (!scanner.hasNextInt()){
            System.out.println("Please enter a valid value");
            scanner.next();
        }

        int numStudents = scanner.nextInt();

        while (numStudents <= 0) {
            System.out.println("Please enter a valid number of students (greater than 0): ");
            numStudents = scanner.nextInt();
        }

        GradeStatistics gradeStats = new GradeStatistics(numStudents);
        gradeStats.initializeScores();
        gradeStats.calculateStats();

        System.out.println("Maximum Grade: " + gradeStats.getMaximumGrade());
        System.out.println("Minimum Grade: " + gradeStats.getMinimumGrade());
        System.out.printf("Average Grade: %.2f%n", gradeStats.getAverageGrade());

        int[] stats = gradeStats.getStats();
        System.out.println("Grades below 21: " + stats[0]);
        System.out.println("Grades 21-40: " + stats[1]);
        System.out.println("Grades 41-60: " + stats[2]);
        System.out.println("Grades 61-80: " + stats[3]);
        System.out.println("Grades 81-100: " + stats[4]);

        // Create and display the grade chart
        GradeChart gradeChart = new GradeChart(gradeStats);
        gradeChart.displayChart();

        scanner.close();
    }
}
