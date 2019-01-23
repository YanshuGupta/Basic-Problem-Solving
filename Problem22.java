import java.util.Scanner;
///////////////////							inprogress
public class Problem22 {

	public static void main(String[] args) {
		// finding target value by minimum sum of elements in an array
		int input[] = {1, 2, 3, 4};
		int output[] = new int[4];
		System.out.println("Enter the Targer Value");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int sum=0;
		if(findSum(input, target, sum, 0, output)) {
			System.out.println("Possible");
		}
	}
	
	public static boolean findSum(int []input, int target, int sum, int index, int output[]) {
		for(int i=index;i<input.length;i++) {
			sum+=input[i];
			if(sum==target) {
				
			}
		}
		return true;
	}

}
