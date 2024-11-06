package JavaC;
import java.util.Scanner;
public class PassFail {
	public static void main(String arg[]) {
		System.out.println("Enter the Student Mark");
		Scanner sc =new Scanner(System.in);
		int mk= sc.nextInt();
		String set =(mk>= 33)?"PASS":"FAIL";
		if(mk>= 33) {
			System.out.println("Student Pass"+" "+set);
		}
		else {
			System.out.println("Student Fail"+" "+set);
			
	}

}
}
