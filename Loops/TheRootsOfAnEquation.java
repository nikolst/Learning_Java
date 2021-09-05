import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        
        for (int x = 0; x <= 1000; x++) {
            if (a * (Math.pow(x, 3)) + b * (Math.pow(x, 2)) + c * x + d == 0) {
                System.out.println(x);
            }
        }
    }
}
