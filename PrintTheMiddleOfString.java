package planet;

import java.util.Scanner;

public class PrintTheMiddleOfString {

    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string: ");
        str = input.nextLine();

        int l = str.length() / 2;

        System.out.println("The middle of the string is: ");
        if (str.length() % 2 == 0)
        {
            System.out.println(str.substring(l - 1, l + 1));
        } else {
            System.out.println(str.substring(l, l + 1));
        }
    }
}
