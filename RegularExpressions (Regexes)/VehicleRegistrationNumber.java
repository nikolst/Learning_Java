import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number

        String regModel = "[ABEKMHOPCTYX][0-9]{3}[ABEKMHOPCTYX]{2}";
        
        boolean isValid = regNum.matches(regModel);
        
        System.out.println(isValid);
        
    }
}
