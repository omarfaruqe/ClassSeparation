import java.util.Scanner;

public class CompassDirection {
    public int normalizeAngle(int angle) {
        // Normalize the angle to be between 0 and 360
        angle = angle % 360;
        if (angle < 0) {
            angle += 360;
        }
        return angle;
    }

    // Function to calculate the nearest compass direction
    public String calculateDirection(int angle) {
        // Array of compass directions
        String[] directions = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};

        // Calculate the index of the nearest compass direction
        int index = (int) Math.round(angle / 45.0) % 8;
        // Return the nearest compass direction
        return directions[index];
    }
}
