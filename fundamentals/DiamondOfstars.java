package fundamentals;
import java.util.*;
public class DiamondOfstars {
    public static void main(String[] args) {
 Scanner  scan= new Scanner(System.in);
		int n=scan.nextInt();
		int num=n/2;
		if(n%2!=0)
		{
			num=n/2+1;
		}
          int k=1;
		  while(k<=n)
		{
                int i=1;

                 while(i<=num)
            {
                    int space=1;
                     while(space<=num-i)

                     {
                         System.out.print(" ");
                         space++;
                     }
                    int j=1;
                    while(j<=i)
                    {
                        System.out.print("*");
                        j++;
                        k++;
                    }
                    j=i-1;
                    while(j>=1)
                    {
                        System.out.print("*");
                        j--;

                    }

                    System.out.println();
                    i++;
            }
		
	}
		  int m=1;
		  while(m<=n-2)
			{
				int x=num-1;
			
			     while(x>=1)
			{
				int space=1;
				 while(space<=num-x)
				 {
					 System.out.print(" ");
					 space++;
				 }
				int y=x;
				while(y>=1)
				{
					System.out.print("*");
					y--;
				m++;
				}
				y=1;
				while(y<=x-1)
				{
					System.out.print("*");
					y++;
					
				}
				
				System.out.println();
				x--;
			}
			
		 }
    }}

