import java.util.Scanner;
import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        int days = Integer.parseInt(elements[1]);
        int hours = Integer.parseInt(elements[2]);
        
        LocalDateTime dateTime = LocalDateTime.parse(elements[0]);
        dateTime = dateTime.plusDays(days);
        dateTime = dateTime.minusHours(hours);
        System.out.println(dateTime);
    }
}
