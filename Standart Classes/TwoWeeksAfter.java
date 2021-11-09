import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(stringDate);
        System.out.println(date.plusWeeks(2));
    }
}
