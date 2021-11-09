import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int days = scanner.nextInt();
        LocalDate date = LocalDate.ofYearDay(year, days);
        System.out.println(isFirstDay(date));
    }
    
    public static boolean isFirstDay(LocalDate date) {
        return date.getDayOfMonth() == 1 ? true : false;
    }
}
