package fundamentals;
import java.util.Scanner;
public class  MultiplicationTable {
	
	public static void main(String[] args) {
		// Write your code here
//public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =0;
		n=s.nextInt();
		for (int i=1; i<=10; i++) {
			System.out.println(n*i);
		}
	}
}