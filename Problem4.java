import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// Weight of the String
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();		
		first = first.toLowerCase();
		char a[] = first.toCharArray();
		int count=0;
		for(char c:a) {
			count += c-96;
		}
		System.out.println("Weight of the String is:="+count);
	}

}
