import java.util.Scanner;
import java.time.LocalTime;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        LocalTime time = LocalTime.ofSecondOfDay(seconds);
        System.out.println(time);
    }
}
