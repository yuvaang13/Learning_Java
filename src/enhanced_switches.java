import java.util.Scanner;

public class enhanced_switches {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What day of the week is it: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("it is a weekday");
            case "saturday", "sunday" ->
                    System.out.println("it is a weekend");
            default -> System.out.println(day + " is not a day");

        }
        scanner.close();
    }
}
