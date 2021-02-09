package planet;

import java.util.Scanner;

public class Trapezoid {

    static double area(int a, int b, int h)
    {
        int s = ((a + b) / 2) * h;
        return s;
    }

    int median(int a, int b)
    {
        int m = (a + b) / 2;
        return m;
    }

    void showCalculations(int a, int b, int h)
    {
        System.out.println("The area of the trapezoid is: " + area(a, b, h));
        System.out.println("The median of the trapezoid is: " + median(a, b));
    }

    boolean checkValues(int b, int h)
    {
        boolean check = false;
        if (b == h) check = true;
        return check;
    }

    public static void main(String[] args)
    {
        int a, b, h; //'a' is the biggest base and 'b' is the smallest base
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the large base of the trapezoid: ");
        a = input.nextInt();
        System.out.print("\nEnter the small base of the trapezoid: ");
        b = input.nextInt();
        System.out.print("\nEnter the height of the trapezoid: ");
        h = input.nextInt();

        area(a, b, h); //using method with 'static'
        Trapezoid tr1 = new Trapezoid(); //create new object of the class to call non-static methods
        tr1.median(a, b);
        tr1.showCalculations(a, b, h);
        tr1.checkValues(b, h);

        if(tr1.checkValues(b, h) == true)
        {
            System.out.println("b = h");
        } else {
            System.out.println("b != h");
        }
    }
}
