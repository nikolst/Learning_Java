import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) { 
        String numberOfEdges = scanner.nextLine();
        String[] array = new String[Integer.parseInt(numberOfEdges)];
        
        inputElements(numberOfEdges, array);

        ArrayList<String> parents = new ArrayList<>();
        ArrayList<String> children = new ArrayList<>();

        for (String element : array) {
            String[] str = element.split(" ");
            parents.add(str[0]);
            children.add(str[1]);
        }

        ArrayList<String> leaves = new ArrayList<>();
        
        findChildren(leaves, children, parents);
        printLeaves(leaves);
    }
    
    public static void inputElements(String numberOfEdges, String[] array) {
        for (int i = 0; i < Integer.parseInt(numberOfEdges); i++) {
            array[i] = scanner.nextLine();
        }
    }
    
    public static void findChildren(ArrayList<String> leaves, ArrayList<String> children, ArrayList<String> parents) {
        int p = 0;
        while (p < children.size()) {
            int br = 1;
            String child = children.get(p);
            for (String element : parents) {
                if (child.equals(element)) {
                    ++br;
                }
            }
            if (br == 1) {
                leaves.add(child);
            }
            ++p;
        }
    }
    
    public static void printLeaves(ArrayList<String> leaves) {
        System.out.println(leaves.size());
        for (String s : leaves) {
            System.out.print(s + " ");
        }
    }
}
