import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// power of 10
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		while(n>=9) {
			if(n>10 && n<20) {
				System.out.println("False");
				System.exit(0);
			}
			
			n=n/10;
		}
		if(n==1) {
			System.out.println("True");
		}
		else
			System.out.println("False");

	}

}
