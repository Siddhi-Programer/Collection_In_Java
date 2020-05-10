// Author : Sidheshwari 
// var-arg method 
//accepts  0 or any number of arguments

public class Var_arguments_method {

	// internally int ... args converted to int[]args
	public static int sum(int... arg) {
		int result = 0;
		for (int singlearg : arg) {
			result += singlearg;
		}
		return result;

	}

	// var-arg method has least priority
	// when method with exact match available in class
	public static int sum(int arg) {
		System.out.println("\ninside normal sum(int) method........yahoooo");
		int result = 0;
		result += arg;
		return result;

	}

	// internally int ... args converted to int[]args
	public static void displayInfo(String name, int... marks) {
		int total_marks = 0;
		int subject_count = marks.length;
		for (int singleMark : marks) {
			total_marks += singleMark;
		}
		if (subject_count != 0) {
			double percentage = total_marks / subject_count;
			System.out.println(name + " got " + percentage + " Percentile");
		} else {
			System.out.println(name + " not attented exam...");
		}

	}

	public static void main(String... args) {

		System.out.println("calling var-arg method with no parameter ==> " + sum());
		System.out.println("calling  method with 1 parameter ==> " + sum(1000));
		System.out.println("calling var-arg method with 2 parameter ==> " + sum(20, 2000));

		System.out.println("\n**************************************************************");

		displayInfo("Siddhi", 100, 90);
		displayInfo("Mayur", 100);
		displayInfo("Komal");
		
		sum(77);
		

	}

}
