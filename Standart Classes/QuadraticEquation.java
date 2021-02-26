import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
    
        if (a != 0) {
            double res1 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double res2 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.println(res1 > res2 ? res2 + " " + res1 : res1 + " " + res2);
        }
    }
}
