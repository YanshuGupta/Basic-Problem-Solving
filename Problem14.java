import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// Perfect number// perfect number
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c=1;
		int x=n;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				c=c+i;
			}
		}
		if(x==c) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}

	}

}
