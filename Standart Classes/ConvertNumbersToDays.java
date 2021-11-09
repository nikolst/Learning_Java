import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int day1 = scanner.nextInt();
        int day2 = scanner.nextInt();
        int day3 = scanner.nextInt();
        LocalDate date1 = LocalDate.ofYearDay(year, day1);
        LocalDate date2 = LocalDate.ofYearDay(year, day2);
        LocalDate date3 = LocalDate.ofYearDay(year, day3);
        System.out.println(date1 + "\n" + date2 + "\n" + date3);
    }
}
