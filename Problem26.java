import java.util.Scanner;

public class Problem26 {

	public static void main(String[] args) {
		// differance between given String and Input String
		String given = "abcdefghijklmnopqrstuvwxyz";
		Scanner sc = new Scanner(System.in);
		String input = sc.next().toLowerCase();
		String output="";
		int a[] = new int[26];
		int b[] = new int[26];
		for(int i=0;i<given.length();i++) {
			a[given.charAt(i)-97]++;
		}
		for(int i=0;i<input.length();i++) {
			b[input.charAt(i)-97]++;
		}
		for(int i=0;i<26;i++) {
			if(a[i]>0 && b[i]==0) {
				output = output+ " " + (char)(i+97); 
			}
		}
		System.out.println(output);
	}

}
