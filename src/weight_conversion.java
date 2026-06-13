import java.util.Scanner;

public class weight_conversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weightlbs;
        double weightkgs;
        double newweightlbs;
        double newweightkgs;
        int choice;

        System.out.println("Welcome to the weight conversion calculator");
        System.out.println("Type 1 for pounds to kilograms, or 2 for kilograms to pounds: ");

        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("How many pounds is your object: ");
            weightlbs = scanner.nextDouble();
            newweightkgs = weightlbs * 0.453592;
            System.out.println("The weight in kilograms is " + newweightkgs);
        }

        else if (choice == 2) {
            System.out.print("How many kilograms is your object: ");
            weightkgs = scanner.nextDouble();
            newweightlbs = weightkgs / 0.453592;
            System.out.println("The weight in pounds is " + newweightlbs);
        }

        else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}