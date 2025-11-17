import java.util.Scanner;

public class FitnessTracker {
    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000 && steps < 10000) {
            return "Good";
        } else if (steps >= 4000 && steps < 7000) {
            return "Average";
        } else {
            return "Poor";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your steps for today: ");
        int userSteps = scanner.nextInt();
        String level = getFitnessLevel(userSteps);
        System.out.println("Your fitness level: " + level);
        scanner.close();
    }
}