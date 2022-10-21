package skinfold;

/// <summary>
/// Implements body density calculations for males
/// </summary>
public class MaleBodyDensityCalculator extends BodyDensityCalculator {
    public MaleBodyDensityCalculator() {
        positions = new String[] {
                "Chest skinfold",
                "Abdomen skinfold",
                "Thigh skinfold",
                "Waist circumference",
                "Forearm circumference",
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

        double x2 = measurements[0] + measurements[1] + measurements[2];
        double x3 = measurements[5];
        double x4 = measurements[3];
        double x5 = measurements[4];

        return 1.0990750 - 0.0008209 * x2 + 0.0000026 * x2 - 0.0002017 * x3 - 0.005675 * x4 + 0.018586 * x5;
    }
}
