import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            
            switch (command[0]) {
                case "add":
                    arr.add(Integer.parseInt(command[1]));
                    Collections.sort(arr);
                    break;
                case "remove":
                    arr.remove(Integer.parseInt(command[1]));
                    break;
                case "size":
                    System.out.println(arr.size());
                    break;
                case "indexof":
                    boolean flag = true;
                    int index = -1;
                    for (int j = 0; j < arr.size(); j++) {
                        if (arr.get(j) == Integer.parseInt(command[1]) && flag == true) {
                            index = j;
                            flag = false;
                        }
                    }
                    System.out.println(index);
                    break;
                default:
                    break;
            }
        }
    }
}
