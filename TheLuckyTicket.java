package planet;

import java.util.Scanner;

public class TheLuckyTicket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int sum1 = 0, sum2 = 0;

        char[] ch = str.toCharArray();

        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(String.valueOf(ch[i]));
            sum1 += a;
        }

        for (int j = 3; j < ch.length; j++) {
            int b = Integer.parseInt(String.valueOf(ch[j]));
            sum2 += b;
        }

        if (sum1 == sum2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}
