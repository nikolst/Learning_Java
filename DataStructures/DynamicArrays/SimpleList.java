import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] command;
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        for (int i = 0; i < n; i++) {
            command = scanner.nextLine().split(" ");
            
            switch (command[0]) {
                case "add":
                    dynamicArray.add(Integer.parseInt(command[1]));
                    break;
                case "remove":
                    dynamicArray.remove();
                    break;
                case "size":
                    System.out.println(dynamicArray.getSize());
                    break;
                default:
                    break;
            }
        }
    }
}

class DynamicArray<E> {
    private Object[] arr;
    private int size;

    private final int DEFAULT_CAPACITY = 10;
    private final double SCALING_FACTOR = 1.5;

    public DynamicArray() {
        this.arr = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    private void tryIncrease() {
        if (arr.length == size) {
            arr = Arrays.copyOf(arr, (int) (arr.length * SCALING_FACTOR));
        }
    }

    public void add(E value) {
        tryIncrease();
        arr[size++] = value;
    }
    
    public void remove() {
        System.arraycopy(arr, size, arr, size - 1, 0);
        arr[--size] = null;
    }
}
