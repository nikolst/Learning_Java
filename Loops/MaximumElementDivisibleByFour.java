import java.util.Scanner;

class Main {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();
        int max = 0;

        //input the numbers, check which are divisible by 4 and find the max
        for (int i = 0; i < numberOfElements; i++) {
            int number = input.nextInt();
            if (number % 4 == 0 && number > max) {
                max = number;
            }
        }

        System.out.println(max);
    }
}
