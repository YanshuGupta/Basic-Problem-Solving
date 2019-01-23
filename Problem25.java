import java.util.ArrayList;
import java.util.Scanner;

public class Problem25 {

	public static void main(String[] args) {
		// find all unique strings of given length
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<=input.length()-n;i++) {
			try {
				String sub = input.substring(i, i+n);
				if(list.contains(sub)){
					continue;
				}
				else {
					list.add(sub);
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {}
		}
		System.out.println(list);
	}

}
