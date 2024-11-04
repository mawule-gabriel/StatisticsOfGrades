import java.util.Scanner;

public class GradeStatistics {
    private int[] scores;
    private int[] stats;

    public GradeStatistics(int numStudents) {
        scores = new int[numStudents];
        stats = new int[4]; // stats[0] = <40, stats[1] = 41-60, stats[2] = 61-80, stats[3] = 81-100
    }

    public void initializeScores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grades for " + scores.length + " students:");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
    }

    public int getMaximumGrade() {
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    public int getMinimumGrade() {
        int min = scores[0];
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public void calculateStats() {
        for (int score : scores) {
            if (score > 100) {

            } else if (score > 80) {
                stats[3]++; // Count grades from 81 to 100
            } else if (score >= 61) {
                stats[2]++;
            } else if (score >= 41) {
                stats[1]++;
            } else if (score >= 0) {
                stats[0]++;
            }
        }
    }

    public int[] getStats() {
        return stats;
    }
}
