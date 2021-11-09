import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int days = scanner.nextInt();
        LocalDate date = LocalDate.ofYearDay(year, days); //YYYY-MM-dd
        int lastDay = date.lengthOfMonth();
        System.out.println(isLastDay(date, lastDay));
    }
    
    public static boolean isLastDay(LocalDate date, int lastDay) {
        return date.getDayOfMonth() == lastDay ? true : false;
    }
}
