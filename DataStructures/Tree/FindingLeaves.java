import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) { 
        String numberOfEdges = scanner.nextLine();
        int numberOfEdges = scanner.nextInt();
        
        inputElements(numberOfEdges, array);

        ArrayList<Integer> parents = new ArrayList<>();
        ArrayList<Integer> children = new ArrayList<>();

        inputElements(numberOfEdges, parents, children);
        
        findLeaves(children, parents);
        printLeaves(leaves);
    }
    
    public static void inputElements(int numberOfEdges, ArrayList<Integer> parents, ArrayList<Integer> children) {
         for (int i = 0; i < numberOfEdges; i++) {
            parents.add(scanner.nextInt());
            children.add(scanner.nextInt());
        }
    }
    
    public static void findLeaves(ArrayList<Integer> children, ArrayList<Integer> parents) {
        children.removeAll(parents);
    }
    
    public static void printLeaves(ArrayList<Integer> children) {
        System.out.println(children.size());
        children.forEach(child -> System.out.print(child + " "));
    }
}
