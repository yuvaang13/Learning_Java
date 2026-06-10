import java.util.Scanner;

public class shopping_cart_program {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        String item;//giving variable data types beforehand
        double price;
        int quantity;
        double total;


        System.out.print("What item would you like to purchase: ");//asks for user input
        item = scanner.nextLine();
        System.out.print("What is the price for each item: ");
        price = scanner.nextDouble();
        System.out.print("How many items are you buying: ");
        quantity = scanner.nextInt();

        total = price * quantity;//finding total
        System.out.println("Your total is $" + total);//printing total











        scanner.close();
    }
}
