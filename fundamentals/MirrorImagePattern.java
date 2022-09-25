package fundamentals;
import java.util.Scanner;
public class MirrorImagePattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int i = 1;
	while (i<=n) {
		int spaces = 1;
		while (spaces <=n-i) {
			System.out.print(' ');
			spaces = spaces + 1 ;
		}
		int stars = 1;
		while (stars <=i) {
			System.out.print(stars-1+1);
			stars = stars +1 ;
		}
		System.out.println();
		i=i+1;
	}
		
	}

}

