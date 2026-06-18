public class logical_operators {
    public static void main(String[] args){

        double temp = 67;//HAHA 67
        boolean sunny = true;
        if (temp >=32 && temp == 67) {//and checks for both creterias
            System.out.println("it isn't freezing outside, and its 67, HAHA");
        }
        else{
            System.out.println("bruhh");
        }
        if (temp >=32 && temp == 67 && !sunny) {//checks if it is greater than or equal to 32, equal to 67, and if it ISNT sunny
            System.out.println("looks like it isnt sunny out side, but at least its 67");
        }
        else{
            System.out.println("enjoy the sun");
        }
        if (temp < 32 || temp == 67) {//checks if temp is less than 30 or if its 67
            System.out.println("idk what the temp is, but its either 67 or less than 32");
        }
    }
}
