import java.util.Scanner;
public class simple_calc {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double firstno;
        double secondno;
        String oper;
        double ans = 0;

        System.out.print("type in the first number: ");
        firstno = scanner.nextDouble();
        System.out.print("enter an operator (+, -, *, /, ^): ");
        oper = scanner.next();
        System.out.print("enter the second number: ");
        secondno = scanner.nextDouble();
        switch(oper){
            case "+" -> ans = firstno + secondno;
            case "-" -> ans = firstno - secondno;
            case "*" -> ans = firstno * secondno;
            case "/" -> ans = firstno / secondno;
            case "^" -> ans = Math.pow(firstno, secondno);
        }
        System.out.println("your answer is " + ans);

        scanner.close();

    }
}
