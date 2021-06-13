import java.util.Scanner;

class Main {
    
    public static long fact(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long m = input.nextLong();
        long n = 0;
    
        while (m >= fact(n)) {
            n++;
        }

        System.out.println(n);
    }
}
