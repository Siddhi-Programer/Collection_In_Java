import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collections_Arrays_DEMO {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("A");
		al.add("Z");
		al.add("C");
		al.add("X");

		System.out.println("Before Sortingn Arraylist : " + al);

		System.out.println("\nNatural  sorting using Collections.sort()");
		Collections.sort(al);
		System.out.println("After Sorting : " + al);

		ArrayList l = new ArrayList();
		l.add("Sid");
		l.add("Kiru");
		l.add("Viky");

		System.out.println("\nBefore Sortingn Arraylist : " + l);
		// System.out.println("\n"+l);

		Collections.sort(l, new MyComparater());
		System.out.println("\nArraylist sorting using Collections.sort(l,new MyComparator())");
		System.out.println(l);

		// search ArrayList element
		// Collections.binarySerach()
		System.out.println(Collections.binarySearch(l, "Kiru", new MyComparater()));
		System.out.println(Collections.binarySearch(al, "Z"));

		// Collections.reverse()
		System.out.println("Before REversing l : " + l);
		Collections.reverse(l);
		System.out.println("After reversing l : " + l);

		// Array element Soting

		int[] arr = { 13, 10, 16, 2, 25, 100 };

		System.out.print("Array before Soring : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		Arrays.sort(arr);

		System.out.print("\nArray after Soring : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println("\n"+Arrays.binarySearch(arr, 100));

	      // create an array of strings
	      String a[] = new String[]{"abc","klm","xyz","pqr"};

	      List list1 = Arrays.asList(a);

	      // printing the list
	      System.out.println("The list is:" + list1);
		
	
	}
}

class MyComparater implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		String s1 = arg0.toString();
		String s2 = arg1.toString();

		return -s1.compareTo(s2);
	}

}

class MyComparater1 implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Integer i1 = (Integer)arg0;
		Integer i2 = (Integer)arg1;
		return -i1.compareTo(i2);
	}

}

