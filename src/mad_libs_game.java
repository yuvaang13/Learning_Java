import java.util.Scanner;

public class mad_libs_game {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.print("give me an adjective: ");
        String adj1 = scanner.nextLine();
        System.out.print("give me a noun: ");
        String noun1 = scanner.nextLine();
        System.out.print("give me an adjective: ");
        String adj2 = scanner.nextLine();
        System.out.print("give me a verb: ");
        String verb1 = scanner.nextLine();
        System.out.print("give me a noun: ");
        String noun2 = scanner.nextLine();


        System.out.println("Today I went to a really " + adj1 + " class");
        System.out.println("I saw a wild " + noun1 + " a few days ago");
        System.out.println("I went to a really " + adj2 + " restaraunt yesterday");
        System.out.println("I " + verb1 + " with my friends");
        System.out.println("I bought a new " + noun2 + " today, and I'm really excited");

        scanner.close();
    }
}
