package JavaC;
import java.util.Scanner;
public class sample2 {
	public static void main(String arg[]) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Experience ");
		int a = sc.nextInt();
		System.out.println("Salary =2000");
	  int sal =2000;
		if(a>=20) {
			int d=sal/20;
			System.out.println("With Bonus "+d);
		}
		else {
			int f =sal-sal/10;
			System.out.println("10% of Salary "+f);
		}
	}

}
