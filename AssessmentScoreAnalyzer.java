import java.util.Scanner;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[6];
        
        System.out.println("Enter 6 scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("[" + (i + 1) + "] - ");
            scores[i] = scanner.nextInt();
        }
        
        System.out.println();
        
        // Execute cleanly separated business layers
        displayScores(scores);
        System.out.printf("Average: %.2f%n", calculateAverage(scores));
        System.out.println("Lowest Score: " + findLowestScore(scores));
        System.out.println("Passed: " + countPassed(scores));
        
        scanner.close();
    }

    // Prints elements in a single row layout
    public static void displayScores(int[] arr) {
        System.out.print("Scores: ");
        for (int score : arr) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    // Generates total sum and calculates division metrics
    public static double calculateAverage(int[] arr) {
        double sum = 0;
        for (int score : arr) {
            sum += score;
        }
        return sum / arr.length;
    }

    // Scans sequentially to determine the absolute lowest score
    public static int findLowestScore(int[] arr) {
        int lowest = arr[0];
        for (int score : arr) {
            if (score < lowest) {
                lowest = score;
            }
        }
        return lowest;
    }

    // Returns a count tracking data entries that match or exceed 75
    public static int countPassed(int[] arr) {
        int count = 0;
        for (int score : arr) {
            if (score >= 75) {
                count++;
            }
        }
        return count;
    }
}
