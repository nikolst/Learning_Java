import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        boolean flag = true;
        
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        
        if (flag) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
    }
}
