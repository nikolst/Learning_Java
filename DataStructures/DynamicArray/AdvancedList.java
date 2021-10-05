import java.util.Scanner;
import java.util.ArrayList;

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
                    break;
                case "remove":
                    arr.remove(Integer.parseInt(command[1]));
                    break;
                case "size":
                    System.out.println(arr.size());
                    break;
                case "isempty":
                    if (arr.isEmpty()) {
                        System.out.println(true);
                    } else {
                        System.out.println(false); 
                    }
                    break;
                case "contains":
                    int br = 0;
                    for (int k = 0; k < arr.size(); k++) {
                        if (arr.get(k) == Integer.parseInt(command[1])) {
                            br++;
                        } 
                    }
                    if (br > 0) {
                        System.out.println(true);
                    } else {
                        System.out.println(false);
                    }
                    break;
                case "indexof":
                    int index = -1;
                    for (int j = 0; j < arr.size(); j++) {
                        if (arr.get(j) == Integer.parseInt(command[1])) {
                            index = j;
                        }
                    }
                    System.out.println(index);
                    break;
                case "clear":
                    arr.clear();
                    break;
                default:
                    break;
            }
        }
    }
}
