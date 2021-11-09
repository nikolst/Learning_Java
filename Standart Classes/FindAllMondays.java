import java.util.Scanner;
import java.time.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        
        LocalDate date = LocalDate.of(year, month, 1);
        
        int monthLength = date.lengthOfMonth();
        
        for (int i = 0; i < monthLength; i++) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
            date = date.plusDays(1);
        }
        
    }
}
