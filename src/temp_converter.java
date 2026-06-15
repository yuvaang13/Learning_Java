import java.util.Scanner;

public class temp_converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userinp;
        double temp;
        double newtemp;
        double newtemp2;

        System.out.print("What is the temperature?: ");
        temp = scanner.nextDouble();

        System.out.print("Enter 1 to convert to Celsius, enter 2 to convert to Fahrenheit: ");
        userinp = scanner.nextInt();

        if (userinp == 1) {
            newtemp = (temp - 32) * 5.0 / 9.0;
            System.out.println("Your temperature in Celsius is " + newtemp);
        }
        else if (userinp == 2) {
            newtemp2 = (temp * 9.0 / 5.0) + 32;
            System.out.println("Your temperature in Fahrenheit is " + newtemp2);
        }
        else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}