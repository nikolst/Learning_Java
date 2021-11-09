import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int offset = scanner.nextInt();
        LocalDate date = LocalDate.parse(input);
        int year = date.getYear();
        
        for (int i = 0; i < offset; i++) {
            while (date.getYear() == year) {
                System.out.println(date);
                date = date.plusDays(offset);
            }
        }
    }
}
