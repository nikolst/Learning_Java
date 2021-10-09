import java.util.Scanner;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberOfElements = scanner.nextLine();
        String input = scanner.nextLine();
        String[] numbers = new String[Integer.parseInt(numberOfElements)];
        numbers = input.split(" ");
        
        LinkedList<Integer> dll = new LinkedList<>();
        
        addElements(numbers, dll);
        printElements(dll);
        
    }
    
    public static void addElements(String[] numbers, LinkedList<Integer> dll) {
        if (numbers.length == 1) {
            dll.addFirst(Integer.parseInt(numbers[0]));
        } else if (numbers.length == 2) {
            dll.addFirst(Integer.parseInt(numbers[0]));
            dll.addLast(Integer.parseInt(numbers[1]));
        } else if (numbers.length > 2) {
            dll.addFirst(Integer.parseInt(numbers[0]));
            dll.addLast(Integer.parseInt(numbers[1]));
        
            for (int i = 2; i < numbers.length; i++) {
                int first = dll.getFirst();
                int last = dll.getLast();
                int fDifference = Math.abs(first - Integer.parseInt(numbers[i]));
                int lDifference = Math.abs(last - Integer.parseInt(numbers[i]));
                if (fDifference < lDifference) {
                    dll.addFirst(Integer.parseInt(numbers[i]));
                } else {
                    dll.addLast(Integer.parseInt(numbers[i]));
                }
            }
        }
    }
    
    public static void printElements(LinkedList<Integer> dll) {
        for (Integer k : dll) {
            System.out.print(k + " ");
        }
    }
}
