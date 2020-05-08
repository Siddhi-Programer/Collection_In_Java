
public class Insertion_sort {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 40 };

		System.out.print("\narray before sorting :");

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");

		}

		// insertion sorting
		int temp;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			temp = arr[j];

		}

		System.out.print("\narray after sorting :");

		for (int l = 0; l < arr.length; l++) {
			System.out.print(arr[l] + " ");

		}

	}

}
