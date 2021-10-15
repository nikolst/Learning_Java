import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int BINARY_TREE_NODES = 2;
        int numberOfNodes = scanner.nextInt();
        
        ArrayList<Integer> parents = new ArrayList<>();
        ArrayList<Integer> children = new ArrayList<>();
        
        for (int i = 0; i < numberOfNodes; i++) {
            parents.add(scanner.nextInt());
            children.add(scanner.nextInt());
        }
        
        if (numberOfNodes == 0) {
            System.out.println("yes");
        } else {
            int k = 0;
            while (k < parents.size()) {
                int parent = parents.get(k);
                int counter = 0;
                for (int element : parents) {
                    if (parent == element) {
                        ++counter;
                    }
                }
                if (counter != BINARY_TREE_NODES) {
                    System.out.println("no");
                    return;
                }
                ++k;
            }
            System.out.println("yes");
        }
    }
}
