package JavaC;
import java.util.Scanner;
public class CharloworUpper {
	public static void main (String arg[]) {
 Scanner sc= new Scanner (System.in);
 System.out.println("Enter the Charater");
 char c = sc.next().charAt(0);
 if (c>='A' && c<='Z'){
	 System.out.println("Upper Case Char");
 }
 else {
	 System.out.println("Lower Case Char");
 }
}
}
