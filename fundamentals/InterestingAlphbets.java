package fundamentals;
import java.util.Scanner;
public class InterestingAlphbets {
	public static void main(String[] args) {
		//Your code goes here
        	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n) {
			char p = (char)('A'+n-i);
			int j=1;
			while (j<=i) {
			//	char jthChar =(char)('A'+j-1);
				System.out.print(p);
				p=(char)(p+1);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}
}
