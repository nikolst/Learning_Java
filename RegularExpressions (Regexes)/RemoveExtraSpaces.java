import java.util.Scanner;

class RemoveExtraSpacesProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "\\s{2,}";
        
        String result = text.replaceAll(regex, " ");
        System.out.println(result);   
    }
}
