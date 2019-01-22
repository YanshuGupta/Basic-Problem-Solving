import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		//Remove Repeated words
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String output="";
		String repeat="";
		String ss[] = s.split(" ");
		for(int i=0;i<ss.length;i++){
			int flag =0;
			String p[] = repeat.split(" ");
			for(int j=0;j<p.length;j++) {
				if(p[j].equals(ss[i])) {
					flag=1;
				}
			}
			if(flag==1) {
				continue;
			}
			repeat = repeat + ss[i] + " ";
			output =output + ss[i]+ " ";
			
		}
		System.out.println(output);
	}

}
