import java.util.Scanner;

public class pythagoras_theorem {
    public static void main(String[] args) {

        double l1; //leg 1
        double l2; //leg 2
        double lx; //random leg, will be used for if the user selects option 2
        double lanswer; //the leg that the user is looking for, option 2
        double hyp; //hypotenuse
        int userinp; //user input, either 1 or 2

        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO THE PYTHAGORAS THEOREM PROGRAM");
        System.out.print("type '1' to calculate the hypotenuse, or '2' to find a leg: ");

        userinp = scanner.nextInt();

        if (userinp == 1) {
            System.out.print("what is the length of your first leg?: ");
            l1 = scanner.nextDouble();

            System.out.print("what is the length of your second leg?: ");
            l2 = scanner.nextDouble();

            double l1sqrd = Math.pow(l1, 2);
            double l2sqrd = Math.pow(l2, 2);

            hyp = Math.sqrt(l1sqrd + l2sqrd);

            System.out.println("the hypotenuse is " + hyp);
        }

        if (userinp == 2){
            System.out.print("what is the length of the hypotenuse?: ");
            hyp = scanner.nextDouble();

            System.out.print("what is the length of one of the legs of your triangle?: ");
            lx = scanner.nextDouble();

            double hypsqrd = Math.pow(hyp,2);
            double lxsqrd = Math.pow(lx, 2);

            lanswer = Math.sqrt(hypsqrd - lxsqrd);

            System.out.println("the missing leg you are looking for is " + lanswer);


        }

        scanner.close();
    }
}