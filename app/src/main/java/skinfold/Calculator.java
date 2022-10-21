package skinfold;

import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);

    private IBodyDensityCalculator bodyDensityCalculator;

    public void takeAllMeasurements() {
        System.out.print("Enter your gender (m/f): ");
        String gender = scanner.nextLine();

        if (gender.equals("m")) {
            bodyDensityCalculator = new MaleBodyDensityCalculator();
        } else if (gender.equals("f")) {
            bodyDensityCalculator = new FemaleBodyDensityCalculator();
        } else {
            System.out.println("Make sure you only type in the one character 'm' or 'f'!");
            return;
        }

        calculateBodyFatPercent();
    }

    public void calculateBodyFatPercent() {
        double bodyFatPercent = (495 / bodyDensityCalculator.calculate()) - 450;

        System.out.println("Your body fat percentage is: " + bodyFatPercent);
    }
}