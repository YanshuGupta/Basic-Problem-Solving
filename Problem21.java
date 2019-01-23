import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Problem21 {
	
	public static void main(String[] args) {
		// highest average marks
		HashMap<String, Student> hm = new HashMap<String, Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Input");
		int input = sc.nextInt();
		while(input-- > 0) {
			String name = sc.next();
			int mark = sc.nextInt();
			if(hm.containsKey(name)) {
				Student obj = (Student) hm.get(name);
				obj.marks += mark;
				obj.numberOfSubject++;
			}
			else {
				Student obj = new Student(name, mark);
				hm.put(name, obj);
			}
		}
		int max = 0;
		String name=null;
		for(Entry entry:hm.entrySet()) {
			Student obj = (Student) entry.getValue();
			int c = obj.marks / obj.numberOfSubject;
			if(max < c) {
				max = c;
				name = (String) entry.getKey();
			}
		}
		System.out.println((int)max);
	}
	
	
}
class Student{
	String name=null;
	int marks=0;
	int numberOfSubject=0;
	


	public Student(String name, int marks) {
		this.name = name;
		this.marks += marks;
		this.numberOfSubject++;
	}
}