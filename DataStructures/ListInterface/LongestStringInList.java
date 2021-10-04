import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // MY CODE STARTS HERE ------>
        String longestString = "";
        for (String element : list) {
            if (element.length() > longestString.length()) {
                longestString = element;
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            list.set(i, longestString);
        }
      // <----- END OF MY CODE
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}
