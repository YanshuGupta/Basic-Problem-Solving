import java.util.Scanner;

public class Problem23 {

	public static void main(String[] args) {
		// display first non repeating character
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().split(",");
		for(String n:s) {
			char a[] = n.toCharArray();
			for(int i=0;i<a.length;i++) {
				int flag = 0;
				for(int j=0;j<a.length;j++) {
					if(a[i]==a[j]  && i!=j) {
						flag=1;
					}
				}
				if(flag==0) {
					System.out.print(a[i]+" ");
					break;
				}
			}
		}

	}

}
