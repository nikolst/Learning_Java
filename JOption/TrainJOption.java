/*Напишете програма на Java, която прочита от стандартен вход две цели числа,
определя дали първото се дели на второто и извежда текст в диалогов прозорец,
описващ установения резултат.*/

package planet;

import javax.swing.*;
import java.util.Scanner;

public class TrainJOption {

    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = input.nextInt();
        System.out.print("\nEnter the second number: ");
        y = input.nextInt();

        if (x % y == 0)
        {
            JOptionPane.showMessageDialog(null, "The first number is divisible by the second number!");
        } else {
            JOptionPane.showMessageDialog(null, "The first number is NOT divisible by the second number!");
        }
        System.exit(0);
    }
}
