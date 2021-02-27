/*Напишете програма на Java, която прочита от стандартен вход дължина на страна на
куб като цяло число, пресмята обема на геометричното тяло, което е затворено между
стените на куба и вписаната в него сфера. Извежда текст, описващ намерения обем в
диалогов прозорец.*/

package planet;

import javax.swing.*;
import java.util.Scanner;
import java.lang.Math;

public class GeometryJOption {

    public static void main(String[] args) {

        int a; //the length of one side
        double volumeFig, volumeCube, volumeSphere;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the cube side: ");
        a = input.nextInt();

        volumeCube = Math.pow(a, 3);
        volumeSphere = Math.PI * (1/6) * Math.pow(a, 3);
        volumeFig = volumeCube - volumeSphere;
        JOptionPane.showMessageDialog(null, "The volume of the figure is: " + volumeFig);


    }
}
