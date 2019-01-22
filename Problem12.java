import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// // power of 5
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		while(n>=4) {
			if(n>5 && n<10 ) {
				System.out.println("False");
				System.exit(0);
			}
			
			n=n/5;
		}
		if(n==1) {
			System.out.println("True");
		}
		else
			System.out.println("False");


	}

}
