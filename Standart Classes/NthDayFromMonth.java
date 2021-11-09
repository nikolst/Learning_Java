import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int n = scanner.nextInt();
        
        LocalDate date = LocalDate.of(year, month, 1);
        int lastMonthDay = date.lengthOfMonth();
        System.out.println(date.withDayOfMonth(lastMonthDay - n + 1));
    }
}
