//need to use scanner, import utilities
import java.security.KeyStore;
import java.util.Scanner;

public class user_input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //opens scanner

        System.out.print("enter your name: "); //asking the user
        String name = scanner.nextLine(); //declaring the variable name as a string and assigning it the value that the user inputs
        System.out.println("hello " + name);//prints

        System.out.print("enter your age: ");//asks user
        int age = scanner.nextInt();//assigns user input to age
        System.out.println("you are " + age + " years old");//prints output

        System.out.print("are you smart (say true or false): ");
        Boolean smart = scanner.nextBoolean();

        String smartx;

        if (smart == false) {//the purpose of the if statement is to make the language sound normal in the output
            smartx = "not";
        } else {
            smartx = "";
        }

        System.out.println("you are " + smartx + " smart");


        scanner.close(); //closes scanner
    }

}
