
public class MergeSort {

	int[] tempMergeArray;
	int[] array;
	int length;

	public static void main(String[] args) {

		int[] inputArr = { 19, 25, 13, 27, 5, 15, 45 };

		System.out.print("\nBefore Merge Sorting : ");
		for (int i : inputArr) {
			System.out.print(i + " ");
		}

		MergeSort m = new MergeSort();
		m.sort(inputArr);

		System.out.print("\nAfter Merge Sorting : ");
		for (int i : inputArr) {
			System.out.print(i + " ");
		}

	}

	public void sort(int[] inputArr) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArray = new int[length];

		// call to divideArray()
		divideArray(0, length - 1);

	}

	private void divideArray(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// devide left side array (recursive call)
			divideArray(lowerIndex, middle);
			// devide rigt side array (recursive call)
			divideArray(middle + 1, higherIndex);

			mergeArray(lowerIndex, middle, higherIndex);

		}
	}

	public void mergeArray(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			this.tempMergeArray[i] = array[i];
		}

		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) {

			if (tempMergeArray[i] <= tempMergeArray[j]) {
				array[k] = tempMergeArray[i];
				i++;
			} else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			array[k] = tempMergeArray[i];
			k++;
			i++;
		}

	}

}

/* OUTPUT 
 
    Before Merge Sorting : 19 25 13 27 5 15 45 
 	After Merge Sorting : 5 13 15 19 25 27 45 
*/