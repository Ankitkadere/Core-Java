package JavaC;
import java.util.Scanner;

public class Smple1 {
 public static void main (String arg []) {
	 Scanner cs = new Scanner (System.in);
	 System.out.println("Enter the Year");
	 int c = cs.nextInt();
	 
		 if(c%4==0 || c%400==0) {
			 System.out.println("Leap Year");
		 }
			 else {
				 System.out.println("Not Leap Year");
			 }
 }

}