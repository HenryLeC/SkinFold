package skinfold;

import java.util.Scanner;

/// <summary>
/// Implements body density calculations for males
/// </summary>
public class MaleBodyDensityCalculator implements IBodyDensityCalculator {
    private String[] positions = {
            "Chest skinfold",
            "Abdomen skinfold",
            "Thigh skinfold",
            "Waist circumference",
            "Forearm circumference",
            "Age"
    };

    private double[] measurements = new double[positions.length];

    /// <summary>
    /// Calculates the body density based on the measurements taken.
    /// </summary>
    @Override
    public double calculate() {
        takeMeasurements();

        double x2 = measurements[0] + measurements[1] + measurements[2];
        double x3 = measurements[5];
        double x4 = measurements[3];
        double x5 = measurements[4];

        return 1.0990750 - 0.0008209 * x2 + 0.0000026 * x2 - 0.0002017 * x3 - 0.005675 * x4 + 0.018586 * x5;
    }

    /// <summary>
    /// Takes the measurements for the body density calculation.
    /// </summary>
    public void takeMeasurements() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < positions.length; i++) {
            System.out.print("Enter your " + positions[i] + ": ");
            measurements[i] = scanner.nextDouble();
        }

        scanner.close();
    }
}
