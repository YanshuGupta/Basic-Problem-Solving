public class Problem16 {

	public static void main(String[] args) {
		// armstrong Number
		for(int n=1;n<=1000;n++) {
			int x = n;
			int c = 0;
			int power = 0;
			while(n>0) {
				power++;
				n/=10;
			}
			n=x;
			while(n>0) {
				c+=Math.pow(n%10,power);
				n/=10;
			}
			n=x;
			if(x==c) {
				System.out.println(c+" ");
			}
		}
	}

}
