package planet;

import java.util.Scanner;

public class CutTheMiddle {

    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();

        int l = str.length() / 2;

        if (str.length() % 2 == 0) {
            System.out.println(str.substring(0, l - 1) + str.substring(l + 1));
        } else {
            System.out.println(str.substring(0, l) + str.substring(l + 1));
        }
    }
}
