public class string_methods {
    public static void main(String[] args){

        String name = "            Yuvaan Gulati            ";
        int length = name.length(); //.length() allows me to get the length of the string yuvaan gulati
        System.out.println(name); //prints name
        System.out.println(length); //prints length of name
        char letter = name.charAt(0);//since 0 is Y
        System.out.println(letter);//this prints y
        int index = name.indexOf("v");//this will print the index of the v in yuvaan gulati, so 2
        System.out.println(index);//yep
        name = name.toUpperCase();
        System.out.println(name);
        name = name.toLowerCase();//prints all caps
        System.out.println(name);//prints all lower case
        name = name.trim();//removes all of the extra bullshit around my name (dont have space for bs type shi)
        System.out.println(name);
        name = name.replace("a", "o");//replaces all as in my name with os
        System.out.println(name);//damn this looks hella ass
        System.out.println(name.isEmpty());//false cause its not empty
        if (name.contains("g")){
            System.out.println("your name contains a g");//checks if the variable name contains a 'g'
        }
        else {
            System.out.println("your name doesnt have a g");
        }

        if (name.equals("Yuvaan Gulati")){
            System.out.println("your name is yuvaan gulati");
        }
        else {
            System.out.println("your name isnt mine");//the name changes and shit messed ts up
        }
        }

    }
