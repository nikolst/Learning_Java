package planet;

import java.util.Scanner;

public class DoubleCharacters {

    public static void main(String[] args) {

        String myString;
        Scanner input = new Scanner(System.in);
        myString = input.nextLine();
        char[] ch = myString.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
            System.out.print(ch[i]);
        }
    }
}
