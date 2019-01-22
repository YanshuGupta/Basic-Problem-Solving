import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// reverse String with Preserving Order
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char a[] = s.toCharArray();
		
		for(int i=0,j=a.length-1;i<j;) {
			if(a[i] != ' ' && a[j] != ' ') {
				char swap = a[i];
				a[i] = a[j];
				a[j] = swap;
				i++;
				j--;
 			}
			else {
				try {
					if(a[i]==' ') {
						i++;
					}
					if(a[j]==' ') {
						j--;
					}
				}
				catch(ArrayIndexOutOfBoundsException e) {
					
				}
			}
			
		}
		String output = new String(a);
		System.out.println(output);
		

	}

}
