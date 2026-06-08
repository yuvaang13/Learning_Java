public class variables {

    public static void main(String[] args){

        //i already know variables in python, lets see how different these are
        int age = 21; //creating variable (declaring), then assigning (21)
        System.out.println("you are " + age + " years old (unc)");//prints age
        double year = 2026.45;//double is like a float (decimal)
        System.out.println("the year is " + year);//prints it, and we can concatenate like in python, YAYYYYY
        char grade = 'A'; //getting an A on a test
        System.out.println("you got an " + grade + " on the last test");//good job
        boolean areyousmart = true;
        System.out.println("are you smart " + "(" + areyousmart + ")");//peak concatenation
            if (areyousmart){
                System.out.println("you are smart");//prints this cause i declared it as true
            }
            else {
                System.out.println("you are not smart");//doesnt print this, good to know that if/else is pretty much the same here
            }
    }
}
//THESE ARE ALL PRIMITIVE DATA TYPES