import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int size = input.length();
        int counter = 0;
        
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) == 'g' || input.charAt(i) == 'G' || input.charAt(i) == 'c' || input.charAt(i) == 'C') {
                counter++;
            }
        }
        
        double gc = (double) counter / size * 100;
        System.out.println(gc);
    }
}
