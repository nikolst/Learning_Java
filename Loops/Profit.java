import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m = input.nextDouble();
        double p = input.nextDouble();
        double k = input.nextDouble();
        int years = 0;
        double s;
        
        while (m < k) {
            s = m * (p / 100);
            m += s; //добавяме печалбата от лихвата към общата сума
            years++;
        }
        System.out.println(years);
    }
}
