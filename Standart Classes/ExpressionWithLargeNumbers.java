import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();
        BigInteger c = input.nextBigInteger();
        BigInteger d = input.nextBigInteger();
        System.out.println(a.negate().multiply(b).add(c).subtract(d));
    }
}
