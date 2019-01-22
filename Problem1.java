import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();
		first = sort(first);
		second = sort(second);
		if(first.equals(second)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Npt Anagram");
		}
	}
	
	public static String sort(String s){
		char a[] = s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}
}
