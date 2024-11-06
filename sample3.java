package JavaC;
import java.util.Scanner;
public class sample3 {
	public static void main (String arg[]){
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter Age for Vote");
		int Age =sc.nextInt();
		if(Age>=18) {
			System.out.println("Eligible For Vote");
		}
		else {
			System.out.println("not eligible for Vote");
		}
	}

}
