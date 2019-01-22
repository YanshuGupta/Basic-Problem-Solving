import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// Strong Number
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=n;
		int c=0;
		while(n>0) {
			c+=findfact(n%10);
			n/=10;
		}
		if(x==c) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not Strong Number");
	
		}
	}
	public static int findfact(int n) {
		int f=1;
		if(n==0)
			return 1;
		while(n>0) {
			f = f*n;
			n--;
		}
		return f;
	}
}
