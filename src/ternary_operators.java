public class ternary_operators {
    public static void main(String[] main){

        String aura = "max";

        if (aura == ("max")) {
            System.out.println("ur an aura farmer like me");
        }
        else {
            System.out.println("u lowk gotta lock in");//using basic if else statements
        }

        String auraOrNotAura = (aura == "max") ? "ur an aura farmer like me" : "u lowk gotta lock in";
        System.out.println(auraOrNotAura);//using ternary
    }
}
