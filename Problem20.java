import java.util.Scanner;

public class Problem20 {

	public static void main(String[] args) {
		// longest number time occuring Character
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toLowerCase();
		char ss[] = s.toCharArray();
		
		int smax = 0;
		int sindex = -1;
		int max = 1;
		int index = 0;
		char ch = ss[0];
		for(int i=1;i<ss.length;i++){
			if(ss[i] == ch) {
				max++;
			}
			else {
				if(smax < max) {
					smax =max;
					sindex = index;
				}
				ch = ss[i];
				max = 1;
				index = i;
			}
		}
		if(smax < max) {
			smax =max;
			sindex = index;
		}
		
		System.out.println("Longest occuring character is "+ss[sindex]+" length is "+smax+" at index "+sindex);
	}

}
