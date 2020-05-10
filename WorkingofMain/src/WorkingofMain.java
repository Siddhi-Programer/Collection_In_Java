// Auther : Sidheshwari 
public class WorkingofMain {

    static public void main(String [] a) {
		System.out.println("JVM calls main(String[] argsssss)");
		main(new int[] { 1, 2, 3 });
	}

	// allowed keywords : final strictfp synchronized static
	/*
	 * final strictfp synchronized static public void main(String [] args) {
	 * 
	 * System.out.println("JVM calls main(String[] abbb)"); main(new int[] {1,2,3});
	 * }
	 */

	public static void main(int[] args1) {
		System.out.println(" calls main(int[] args)");
		for (int i : args1) {
			System.out.println(i);
		}
	}

}
