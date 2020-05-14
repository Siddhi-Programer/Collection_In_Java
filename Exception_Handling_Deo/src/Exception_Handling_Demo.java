import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exception_Handling_Demo extends RuntimeException{

	public static void main(String[] args) throws InterruptedException{
		
		int a =10, b=15;
		int ans1 =  a+b;
		try {
		   int ans = a/0 ;
		} catch (Exception e) {
			int ans = a/5;
			 System.out.println(ans);
		}
	
		
		PrintWriter pw;
		try {
			pw = new PrintWriter("abc.txt");
			pw.println("Hello Siddhi");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("inside Printwriterrr....");
			e.printStackTrace();
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread.....");
			e.printStackTrace();
		}
		
		//try with multiple catch block
		try {
			System.out.println("inside try block...");   
			String s = null;
			s.length();
			int ans = 10/0;
			// System.exit(0);
		}catch(ArithmeticException e ) {
			System.out.println("inside catch-1 block...");
			System.out.println(e.toString());
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("inside catch-2 block...");
			System.out.println(e.toString());
		}finally {
			System.out.println("inside finally block...");
		}
		
		System.out.println("outside all try catch block...."); 
		 
		
		//throw new ArithmeticException("devide by zero...");
		
		// throw - to throw customized exception of throwable types 
		//throw new Exception_Handling_Demo();
		
		doStuff();
		// demo of throws keyword...
	}		
		public static void doStuff() throws InterruptedException{
			System.out.println("inside doStuff...");
			doMoreStuff();
		}
		
		
		
  

	private static void doMoreStuff() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("inside domOREStuff...");
		 Thread.sleep(500);
	}
	
} 

// Nested try-catch-finally block 

/* class  Exception_Handling_Demo {
	public static void main(String[] args) {
		try {
			System.out.println("outer try...");
			try {
				System.out.println("Inner try...");
				System.out.println(10/0);
			} catch (ArithmeticException e) {
				System.out.println("Inner catch block...");
			} finally {
				System.out.println("Inner finnaly block...");
			}
			System.out.println(10/0);
		} catch (Exception e) {
				System.out.println("Outer catch block...");
		} finally {
			System.out.println("Outer finally block..."); 
		}
	}
} */

/* Output : 
 * outer try... 
 * Inner try... 
 * Inner catch block... 
 * Inner finnaly block... 
 * Outer catch block... 
 * Outer finally block...
 */ 

