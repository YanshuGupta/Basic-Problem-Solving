import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// Print String Starts with 'S'
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ss[] = s.split(" ");
		for(String input:ss) {
			char l[] = input.toCharArray();
			if(l[0]=='s' || l[0]=='S') {
				System.out.print(input+" ");
			}
		}

	}

}
