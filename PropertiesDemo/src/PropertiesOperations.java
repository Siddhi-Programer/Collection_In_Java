import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesOperations {

	public static void main(String[] args) {
		
		// used to store changing properties (like username , pasword )
		// from .properties file
		Properties p = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream("abc.properties");
			p.load(fis);
			System.out.println(p);
			// getProperty()
			String fetchedName = p.getProperty("name");
			System.out.println(fetchedName);
			// setProperty()
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter new Name : ");
			String newName = sc.nextLine();
			p.setProperty("name", newName);
			
			FileOutputStream fos = new FileOutputStream("abc.properties");
			p.store(fos, "Changed by Siddhi");
			
			System.out.println("after change -----> ");
			System.out.println(p);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} 

	}

}
