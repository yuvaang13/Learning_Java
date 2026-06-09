import java.util.Scanner;


public class area_of_rectangle_w_user_input {

    public static void main (String[] args){

        //calculating area of rectangle w/ user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("give me a side length: ");
        Double length = scanner.nextDouble();
        System.out.print("give me a width: ");
        Double width = scanner.nextDouble();
        System.out.println("the area of your rectangle is " + width*length);

    }
}
