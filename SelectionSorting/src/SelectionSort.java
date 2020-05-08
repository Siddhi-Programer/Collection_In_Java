
// Programmer - Sidheshwari
public class SelectionSort {
	
	
	public void StringArraySorting(String[] strArray) {
		
		System.out.print("Given array before Sorting: ");

		for (String str : strArray) {
			System.out.print(str + " ");
		}

		int small; 
		String temp = "";
		//***** Selection Sorting *******
		for (int i = 0; i < strArray.length; i++) {
			small = i;
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[j].compareTo( strArray[i]) < 0) {
					small = j;
				}
			}
			if (small != i) {
				temp = strArray[i];
				strArray[i] = strArray[small];
				strArray[small] = temp;
			}
		}

		System.out.print("\nGiven array after Sorting: ");

		for (String s : strArray) {
			System.out.print(s + " ");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputArray = { 10, 25, 33, 27, 1, 25, 55, 33 };

		System.out.print("Given array before Sorting: ");

		for (int i : inputArray) {
			System.out.print(i + " ");
		}

		int small, temp = 0;
		//***** Selection Sorting *******
		for (int i = 0; i < inputArray.length; i++) {
			small = i;
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] > inputArray[j]) {
					small = j;
				}
			}
			if (small != i) {
				temp = inputArray[i];
				inputArray[i] = inputArray[small];
				inputArray[small] = temp;
			}
		}

		System.out.print("\nGiven array after Sorting: ");

		for (int i : inputArray) {
			System.out.print(i + " ");
		}
		
		SelectionSort s = new SelectionSort();
		s.StringArraySorting(new String[] {"Kiya","Kayara","Ayan", "Arya"});

	}

}

/*     OUTPUT
 Given array before Sorting: 10 25 33 27 1 25 55 33 
Given array after Sorting: 1 10 25 25 27 33 33 55 

*/
