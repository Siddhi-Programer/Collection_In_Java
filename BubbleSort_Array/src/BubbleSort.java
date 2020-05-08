import java.util.Scanner;

// created bt Sidheshwari 
// Date : 8/05/2020
public class BubbleSort {

	public static void main(String[] args) {

		// ask user to enter array size
		System.out.println("Enter Array Size :");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		// declare and create array with user entered array size
		int[] inputArray = new int[size];

		// scan input from user and store in inputArray
		for (int i = 0; i < size; i++) {
			System.out.println("Enter " + i + " th eement in array : ");
			inputArray[i] = sc.nextInt();
		}

		// print user entered input array
		System.out.print("\ninput array : ");
		for (int i = 0; i < size; i++) {
			System.out.print(inputArray[i] + " ");
		}

		int temp;
		// out for loop - no. of bubble rounds (n-1)
		for (int i = 0; i < inputArray.length - 1; i++) {

			for (int j = 0; j < inputArray.length - i; j++) {
				if (j + 1 <= inputArray.length - 1 && inputArray[j] > inputArray[j + 1]) {
					{
						// swap elements
						temp = inputArray[j];
						inputArray[j] = inputArray[j + 1];
						inputArray[j + 1] = temp;
					}
				}
			}

		}

		// Sor array
		System.out.print("\nSorrted array (using bubble Sorting): ");
		for (int i = 0; i < size; i++) {
			System.out.print(inputArray[i] + " ");
		}

	}

}

/*   Output 
Enter Array Size :
5
Enter 0 th eement in array : 
12
Enter 1 th eement in array : 
100
Enter 2 th eement in array : 
10
Enter 3 th eement in array : 
55
Enter 4 th eement in array : 
39

input array : 12 100 10 55 39 
Sorrted array (using bubble Sorting): 10 12 39 55 100
*/


