package JavaC;
import java.util.Scanner;
public class NumPosorNag {
public static void main (String arg[]) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the Number For Check");
	int num =sc.nextInt();
	 String s= (num>0 )?"grater":"not";
	if(num==0) {
		System.out.println("Number is Zeero");
	}
	else if(num> 0) {
		System.out.println("Greater then Zeero"+s);
	}
	else{
		System.out.println("Less Then Zeero"+s);
	}
	
   
}
}
