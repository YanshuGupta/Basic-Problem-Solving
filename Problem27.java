import java.util.Scanner;

public class Problem27 {

	public static void main(String[] args) {
		// Panagram finder
		Scanner sc = new Scanner(System.in);
		String input = sc.next().toLowerCase();
		String output=findMissingLetters(input);
		
		System.out.println(output);

	}
	public static String findMissingLetters(String input) {
		char a[] = input.toCharArray();
		int p[] = new int[26];
		String output="";
		for(char c:a) {
			if(Character.isLowerCase(c))
				p[c-97]++;
		}
		for(int i=0;i<26;i++) {
			if(p[i]==0) {
				output += (char)(i+97) + " "; 
			}
		}
		if(output == "") {
			return "No Missing Character";
		}
		return "Missing characters are: ="+output;
	}
}
