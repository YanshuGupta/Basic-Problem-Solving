import java.util.Scanner;

public class Problem19 {

	public static void main(String[] args) {
		// Prime Fraction
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=1) {
			System.exit(0);
		}
		for(int i=2;i<=n;) {
			if(isPrime(i) && n%i==0) {
				if(flag) {
					System.out.print(", ");
				}
				flag = true;
				System.out.print(i);
				n/=i;
			}
			else {
				i++;
			}
		}
		
	}
	public static boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
