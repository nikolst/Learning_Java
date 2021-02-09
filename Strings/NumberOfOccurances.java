package planet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstString = input.nextLine();
        String secondString = input.nextLine();

        int count = (firstString.split(secondString, -1).length - 1);
        System.out.println(count);
    }
}
