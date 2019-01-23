import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		//numerology number
		int count[] = {1,2,3,4,5,8,3,5,1,1,2,3,4,5,7,8,1,2,3,4,6,6,6,5,1,7};
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(Character.toUpperCase(s.charAt(i)) >= 'A' && Character.toUpperCase(s.charAt(i)) <= 'Z') {
				c += count[Character.toUpperCase(s.charAt(i))-65];
			}
		}
		if(c==0) {
			c=0;
		}
		else if(c%9==0) {
			c=9;
		}
		else {
			c=c%9;
		}
		System.out.println("Numerology count is ="+c);
	}

}