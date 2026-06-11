import java.util.Random;


public class random_numbers {
    public static void main (String[] args){

        Random random = new Random();

        int number;

        number = random.nextInt(1,100);//assigns var number a random number between 1 and 100
        System.out.println(number);//prints number

        int no1;
        int no2;
        int no3;

        no1 = random.nextInt(1,7);//have to do 7 cause it doesnt include bound assigned number
        no2 = random.nextInt(1,7);
        no3 = random.nextInt(1,7);//random # between 1 and 6, like rolling dice
        System.out.println(no1);//like rolling 3 dice
        System.out.println(no2);
        System.out.println(no3);

        double no4;
        no4 = random.nextInt();//random double
        System.out.println(no4);

        boolean coin;
        coin = random.nextBoolean();//random true or false, heads - true, false - tails
        System.out.println(coin);//prints

    }
}
