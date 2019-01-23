import java.util.Scanner;

public class Problem28 {

	public static void main(String[] args) {
		// median of two sorted array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of first sorted array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Sorted Array");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the Size of Second sorted array");
		int m = sc.nextInt();
		int b[] = new int[m];
		System.out.println("Enter the Sorted Array");
		for(int i=0;i<m;i++) {
			b[i] = sc.nextInt();
		}
		
		//Merging
		int c[] = new int[n+m];
		int i=0,j=0,k=0;
		for(;i<n && j<m;) {
			if(a[i] <= b[j]) {
				c[k++] = a[i++];
			}
			else {
				c[k++] = b[j++];
			}
		}
		if(i<n) {
			while(i<n) {
				c[k++] = a[i++];
			}
		}
		if(j<m) {
			while(j<m) {
				c[k++] = b[j++];
			}
		}
		for(k=0;k<m+n;k++) {
			//System.out.print(c[k]);
		}
		if((m+n)%2!=0) {
			System.out.println(c[((m+n)/2)]);
		}
		else {
			System.out.println(c[((m+n)/2)-1]);
		}
	}

}     
