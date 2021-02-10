package planet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] ch = str.toCharArray(); //convert our string to char array
        char letter;
        int count = 1; //initialize the counter 

        for (int i = 0; i < ch.length - 1; i++) {
            letter = ch[i];
            
            if (letter == ch[i + 1]) {
                count++; //increase the count with 1 if the current letter is equal to the next one
            }

            if (letter != ch[i + 1]) {
                System.out.print(letter + "" + count);
                count = 1;
            }
        }
        System.out.print(ch[ch.length - 1] + "" + count); //if this is missing, the algorithm is not going to print the last character and it`s count
    }
}
