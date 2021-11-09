import java.util.Scanner;
import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        final int hours = 11;
        
        LocalDateTime dateTime = LocalDateTime.parse(input);
        dateTime = dateTime.plusHours(hours);
        System.out.println(dateTime.toLocalDate());
    }
}
