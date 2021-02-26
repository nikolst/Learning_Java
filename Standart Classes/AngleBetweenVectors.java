import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int b1 = input.nextInt();
        int b2 = input.nextInt();
    
        System.out.println(Math.toDegrees(Math.acos((a1 * b1 + a2 * b2) / (Math.hypot(a1, a2) * Math.hypot(b1, b2)))));
    }
}
