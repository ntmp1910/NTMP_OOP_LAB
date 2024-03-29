import java.util.Scanner;
import java.lang.Math;

public class CAL2263{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
//abc
        double delta=b*b-(4*a*c);
        double onesol= -b/(2*a);
        double firstsol= ((-b-Math.sqrt(delta))/(2*a));
        double secondsol= ((-b+Math.sqrt(delta))/(2*a));
        if(delta<0)
        {
            System.out.print("No solution");
        }
        else if(delta==0)
        {
            System.out.print("One solution: "+ onesol);
        }
        else {
            System.out.print("First solution: "+ firstsol);
            System.out.print("\nSecond solution: "+ secondsol);
        }

        input.close();
    }
}
//ntmp