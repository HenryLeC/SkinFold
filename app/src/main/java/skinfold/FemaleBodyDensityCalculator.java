package skinfold;

import java.util.Scanner;

public class FemaleBodyDensityCalculator implements IBodyDensityCalculator {
    private String[] positions = {
            "Tricep skinfold",
            "Thigh skinfold",
            "Suprailiac skinfold",
            "Gluteal circumference",
            "Age"
    };

    private double[] measurements = new double[positions.length];

    @Override
    public double calculate() {
        takeMeasurements();

        double x3 = measurements[0] + measurements[1] + measurements[2];
        double x4 = measurements[4];
        double x5 = measurements[3];

        return 1470292 - 0.0009376 * x3 + 0.0000030 * x3 - 0.0001156 * x4 - 0.0005839 * x5;
    }

    public void takeMeasurements() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < positions.length; i++) {
            System.out.print("Enter your " + positions[i] + ": ");
            measurements[i] = scanner.nextDouble();
        }

        scanner.close();
    }
}
