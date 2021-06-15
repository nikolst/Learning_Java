import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char[] letter = new char[word.length()];
        boolean flag = true;

        for (int i = 0; i < word.length(); i++) {
            letter[i] = word.charAt(i);
        }

        for (int j = 1; j < letter.length; j++) {
            if (letter[j] != letter[j - 1] + 1) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}
