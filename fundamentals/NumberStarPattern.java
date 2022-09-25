package fundamentals;
import java.util.Scanner;
public class NumberStarPattern{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int lines = s.nextInt();
		int i,j;
		int spaces=0;
		for (i=0;i<lines;i++) {
			for(j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
		for (j=1;j<=lines;j++) {
			if (j<=(lines-i))
				System.out.print(j);
			else 
				System.out.print("*");
		
		}
		j--;
		while (j>0) {
			if (j>lines-i) 
				System.out.print("*");
				else
					System.out.print(j);
			j--;
			}
		
			if ((lines-i)>9)
				spaces=spaces+1;
			System.out.println("");
			
				
		}
			
		}
	} 
