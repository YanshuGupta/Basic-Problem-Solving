import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// // power of 5
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		Scanner sc = new Scanner(System.in);
			int n= sc.nextInt();
			while(n>=5) {
				if(n%5==0) {
					n/=5;
				}
				else {
					break;
				}
			}
			if(n==1) {
				System.out.println("True");
			}
			else{
				System.out.println("False");
			}

	}

}
