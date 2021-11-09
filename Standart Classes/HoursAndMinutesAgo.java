import java.util.Scanner;
import java.time.LocalTime;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        
        LocalTime time = LocalTime.parse(input);
        time = time.minusHours(hours);
        time = time.minusMinutes(minutes);
        System.out.println(time);
    }
}
