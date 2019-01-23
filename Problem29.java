import java.util.Scanner;

public class Problem29 {

	public static void main(String[] args) {
		// Printing Maximum occurance of a String
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();
		int a[] = new int[26];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i)<= 'Z') {
				a[s.charAt(i)-65]++;
			}
		}
		for(int i=0;i<26;i++) {
			if(a[i] != 0) {
				System.out.print((char)(i+65)+"="+a[i]+" ");
			}
		}

	}

}
