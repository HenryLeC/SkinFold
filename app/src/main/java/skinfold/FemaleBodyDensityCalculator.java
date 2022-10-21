package skinfold;

/// <summary>
/// Implements body density calculation for females
/// </summary>
public class FemaleBodyDensityCalculator extends BodyDensityCalculator {
    public FemaleBodyDensityCalculator() {
        positions = new String[] {
                "Tricep skinfold",
                "Thigh skinfold",
                "Suprailiac skinfold",
                "Gluteal circumference",
                "Age"
        };

        measurements = new double[positions.length];
    }

    /// <summary>
    /// Calculates the body density based on the measurements taken.
    /// </summary>
    @Override
    public double calculate() {
        takeMeasurements();

        double x3 = measurements[0] + measurements[1] + measurements[2];
        double x4 = measurements[4];
        double x5 = measurements[3];

        return 1470292 - 0.0009376 * x3 + 0.0000030 * x3 - 0.0001156 * x4 - 0.0005839 * x5;
    }
}
