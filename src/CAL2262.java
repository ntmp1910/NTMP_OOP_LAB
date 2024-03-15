import java.util.Scanner;

public class CAL2262{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a: ");
        double a1 = input.nextDouble();
        System.out.print("Enter b: ");
        double b1 = input.nextDouble();
        System.out.print("Enter c: ");
        double c1 = input.nextDouble();

//abc
        System.out.print("Enter d: ");
        double a2 = input.nextDouble();
        System.out.print("Enter e: ");
        double b2 = input.nextDouble();
        System.out.print("Enter f: ");
        double c2 = input.nextDouble();
        double determinant = a1 * b2 - a2 * b1;

        if (determinant != 0) {
            double x = (c1 * b2 - c2 * b1) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;

            System.out.println("The solution for the system is:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            if (a1 / a2 == b1 / b2 && b1 / b2 == c1 / c2) {
                System.out.println("Infinite solution");
            } else {
                System.out.println("No solution.");
            }
        }




        input.close();
    }
}