import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArrayUsingLoop {

	
	// Programme by Sidheshwari 
	// Date : 8/5/20
	public static void main(String[] args) {

		int[] inputArray = { 10, 20, 10, 30, 40, 50, 100, 100, 50,100 };
		
		// print Array
		System.out.print("Original input Array :");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]+" ");
		}
		
		
		// 1st Approach :using nested for loop ((Time Complexity : O(n^2)))
		System.out.print("\nDuplicate Elements in Array(Using for loop) :");
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j])
					System.out.print(inputArray[i] + " ");
			}
		}

		// 2nd Approach :using Hashset (Time Complexity : O(n))
		Set<Integer> inputNumberset = new HashSet<>();
		System.out.print("\nDuplicate Elements in Array(Using set) :");
		for (int i = 0; i < inputArray.length; i++) {

			if (!inputNumberset.add(inputArray[i]))
				System.out.print(inputArray[i] + " ");
		}
	}

}
