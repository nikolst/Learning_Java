import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        
        LocalDateTime dateTime1 = LocalDateTime.parse(input1);
        LocalDateTime dateTime2 = LocalDateTime.parse(input2);
        
        System.out.println(ChronoUnit.HOURS.between(dateTime1, dateTime2));
    }
}
