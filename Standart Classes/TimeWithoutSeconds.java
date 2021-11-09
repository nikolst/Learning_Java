import java.util.Scanner;
import java.time.LocalTime;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LocalTime time = LocalTime.parse(input);
        System.out.println(time.withSecond(0));
    }
}
