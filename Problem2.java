import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		first = first.toLowerCase();
		char a[] = first.toCharArray();
		int p[] = new int[26];
		for(char c:a) {
			if(Character.isLowerCase(c))
				p[c-97]++;
		}
		for(int i=0;i<26;i++) {
			if(p[i]==0) {
				System.out.println("Not Panagram");
				System.exit(0);
			}
		}
		System.out.println("Panagram");
	}

}
