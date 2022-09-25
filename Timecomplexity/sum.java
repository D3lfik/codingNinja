package Timecomplexity;

public class sum {
	public static void func(int n)
	{
		   int sum=0;
		    for(int i=1;i<n*n;i++)
		        sum+=i;
		    System.out.println(sum);
	}
	public static void main(String[] args) {
		int n=4;
	    func(n);
	    System.out.println(n);
	}
}
