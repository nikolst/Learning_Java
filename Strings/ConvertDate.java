package planet;

 import java.util.Scanner;

 public class ConvertDate {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String dateString = input.nextLine();
         String[] parts = dateString.split("-");

         System.out.println(parts[1] + "/" + parts[2] + "/" + parts[0]);
     }
 }
