public class GradeChart {
    private final GradeStatistics gradeStatistics;

    public GradeChart(GradeStatistics gradeStatistics) {
        this.gradeStatistics = gradeStatistics;
    }

    public void displayChart() {
        int[] stats = gradeStatistics.getStats();
        int maxCount = 0;

        // Determine the maximum count for scaling the graph
        for (int count : stats) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // Print the graph
        System.out.println("\nGraph:");
        for (int i = maxCount; i > 0; i--) {
            System.out.print("   " + String.format("%2d", i) + "  >");
            for (int count : stats) {
                if (count >= i) {
                    System.out.print("  #######  ");
                } else {
                    System.out.print("           ");
                }
            }
            System.out.println();
        }

        // Print the bottom of the graph
        System.out.print("      +");
        for (int j = 0; j < stats.length; j++) {
            System.out.print("-----------+");
        }
        System.out.println();

        // Print grade ranges
        System.out.print("       ");  // Offset to align with the chart
        String[] ranges = {"0-20", "21-40", "41-60", "61-80", "81-100"};
        for (String range : ranges) {
            System.out.print("   " + range + "   ");
        }
        System.out.println();
    }
}
