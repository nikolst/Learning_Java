import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        // write your code here
        Pattern pattern1 = Pattern.compile("(^|\\W)" + part + "[a-zA-Z]*", Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile("[a-zA-Z]*" + part + "(\\W|$)", Pattern.CASE_INSENSITIVE);
        
        Matcher matcher1 = pattern1.matcher(line);
        Matcher matcher2 = pattern2.matcher(line);
        
        if (matcher1.find() || matcher2.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
