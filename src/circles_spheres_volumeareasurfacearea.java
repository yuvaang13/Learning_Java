import java.util.Scanner;

public class circles_spheres_volumeareasurfacearea {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int userinp;
        double radius;
        double circ;
        double volume;
        double area;
        double sfarea;

        System.out.println("WELCOME TO THE CIRCLE/SPHERE FUNCTIONS CALCULATOR.");
        System.out.print("ENTER 1 FOR AREA, 2 FOR CIRCUMFERENCE, 3 FOR SURFACE AREA (SPHERE), 4 FOR VOLUME (SPHERE): ");

        userinp = scanner.nextInt();

        if (userinp == 1) {
            System.out.print("What is the radius?: ");
            radius = scanner.nextDouble();

            area = Math.PI * Math.pow(radius, 2);
            System.out.println("The area of your circle is " + area);
        }

        else if (userinp == 2) {
            System.out.print("What is the radius?: ");
            radius = scanner.nextDouble();

            circ = 2 * Math.PI * radius;
            System.out.println("The circumference of the circle is " + circ);
        }

        else if (userinp == 3) {
            System.out.print("What is the radius?: ");
            radius = scanner.nextDouble();

            sfarea = 4 * Math.PI * Math.pow(radius, 2);
            System.out.println("The surface area of the sphere is " + sfarea);
        }

        else if (userinp == 4) {
            System.out.print("What is the radius?: ");
            radius = scanner.nextDouble();

            volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            System.out.println("The volume of the sphere is " + volume);
        }

        scanner.close();
    }
}