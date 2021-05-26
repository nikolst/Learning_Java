package planet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String array = input.nextLine(); // input numbers as a string

		ArrayList<Integer> numbers = new ArrayList<>();

		//split the string at intervals and add the numbers to the ArrayList
		for (String num : array.split(" ")) {
			numbers.add(Integer.parseInt(num));
		}

		int n = input.nextInt();
		int distance = 0; //the minimum distance between n and the i-th number
		ArrayList<Integer> distances = new ArrayList<>(); //array list to save the distances between n and i-th element

		for (int i : numbers) {
			distance = Math.abs(n - i);
			distances.add(distance);
		}

		int minDistance = distances.get(0);


		ArrayList<Integer> result = new ArrayList<>(); //ArrayList to save the final result

    //find the minimum distance between n and i-th element with value k
		for (int k : distances) {
			if (minDistance >= k) {
				minDistance = k;
			}
		}

    //add the elements with min distances by their indexes 
		for (int l = 0; l < distances.size(); l++) {
			if (distances.get(l) == minDistance) {
				result.add(numbers.get(l));
			}
		}
    
    //sort and print the values from the initial ArrayList
		Collections.sort(result);
		for (int s : result) {
        System.out.print(s + " ");
    }
	}
}
