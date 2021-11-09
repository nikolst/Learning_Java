import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        
        LocalTime time1 = LocalTime.parse(input1);
        LocalTime time2 = LocalTime.parse(input2);
        
        System.out.println(Math.abs(time1.toSecondOfDay() - time2.toSecondOfDay()));
    }
}
