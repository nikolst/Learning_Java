package planet;

import java.util.Scanner;

public class FindFirstOccurance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();
        myString = myString.toLowerCase();
        char[] toCh = myString.toCharArray();
        int save = 0;
        boolean flag = false;

        for (int i = 0; i < toCh.length; i++) {
            if (toCh[i] == 't' && toCh[i + 1] == 'h' && toCh[i + 2] == 'e') {
                flag = true;
                save = i;
                break;
            }
        }

        if (flag) { //if flag == true
            System.out.println(save);
        } else {
            System.out.println(-1);
        }
    }
}
