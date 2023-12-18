import Exercise1.BirthYearCalculator;
import Exercise1.IntTools;
import Exercise1.InvalidAgeException;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Introduce your age: ");
            int age = scanner.nextInt();
            BirthYearCalculator calc = new BirthYearCalculator();
            int birthYear = calc.birthYearCalculator(age);
            System.out.println("Your birth year is " + birthYear);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            main(args);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            scanner.close();
        }

        IntTools intTools = new IntTools(1234567);
        System.out.println("Digit Sum: " + intTools.digitSum());
        System.out.println("Last Digit: " + intTools.lastDigit());

        try {
            System.out.println("Digit at position 2: " + intTools.digitAt(2));
            System.out.println("Digit at position 6: " + intTools.digitAt(6));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
