package skinfold;

import java.util.Scanner;

/// <summary>
/// Interface for different gender body density calculators.
/// </summary>
public abstract class BodyDensityCalculator {
    protected String[] positions;

    protected double[] measurements;

    public abstract double calculate();

    /// <summary>
    /// Takes the measurements for the body density calculation.
    /// </summary>
    protected void takeMeasurements() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < positions.length; i++) {
            System.out.print("Enter your " + positions[i] + ": ");
            measurements[i] = scanner.nextDouble();
        }

        scanner.close();
    }
}
