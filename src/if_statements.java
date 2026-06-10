import java.util.Scanner;//using input age

public class if_statements {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        int age;
        System.out.print("what is your age (whole number)?: ");
        age = scanner.nextInt();

        System.out.println();

        if(age>= 18){
            System.out.println("u are an adult");
        }

        else if(age < 0){
            System.out.println("u arent born");
        }
        else{
            System.out.println("u are a child");
        }

    }


}
