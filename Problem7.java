import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// Fibbonacci
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms");
		int n = sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++) {
			int c = a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}

}
