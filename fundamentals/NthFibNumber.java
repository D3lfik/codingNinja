package fundamentals;
import java.util.*;
public class NthFibNumber {
	public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i)
        {
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;	
            if(i==n)
            {
            	System.out.print(t1);
            }
	}
}
}
