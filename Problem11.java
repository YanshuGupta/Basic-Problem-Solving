import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		//// power of 2
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		while(n>=2) {
			if(n%2!=0) {
				System.out.println("False");
				System.exit(0);
			}
			n=n/2;
		}
		if(n==1) {
			System.out.println("True");
		}

	}

}
