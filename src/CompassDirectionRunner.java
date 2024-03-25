import java.util.Scanner;

public class CompassDirectionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the angle
        System.out.print("Enter the angle (in degrees): ");
        int angle = scanner.nextInt();

        CompassDirection compassDirection = new CompassDirection();
        angle = compassDirection.normalizeAngle(angle);
        // Calculate the nearest compass direction
        String direction = compassDirection.calculateDirection(angle);

        // Print the result
        System.out.println("Nearest compass direction: " + direction);
        scanner.close();
    }
}
