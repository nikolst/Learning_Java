import java.util.Scanner;
import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        LocalDateTime dateTime = LocalDateTime.parse(input);
        dateTime = dateTime.minusHours(hours);
        dateTime = dateTime.plusMinutes(minutes);
        System.out.println(dateTime);
    }
}
