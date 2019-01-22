import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// print non repeating character
		Scanner sc = new Scanner(System.in);
		String ss= sc.nextLine();
		char a[]= ss.toCharArray();
		for(int i=0;i<ss.length();i++) {
			int flag=0;
			for(int j=0;j<ss.length();j++) {
				if(a[i]==a[j]) {
					flag++;
				}
			}
			if(flag>=2){
				continue;
			}
			System.out.print(a[i]);
		}
		

	}

}
