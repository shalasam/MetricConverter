import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double meters;

        // Get the measurement in meters
        do {
            System.out.print("Enter the measurement in meters: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number for meters.");
                in.next(); // Consume the invalid input
            }
            meters = in.nextDouble();
        } while (meters < 0);

        // Conversion constants
        final double METERS_TO_MILES = 0.000621371;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.3701;

        // Perform conversions
        double miles = meters * METERS_TO_MILES;
        double feet = meters * METERS_TO_FEET;
        double inches = meters * METERS_TO_INCHES;

        // Display results
        System.out.println("\nConversion Results:");
        System.out.println("Miles: " + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}