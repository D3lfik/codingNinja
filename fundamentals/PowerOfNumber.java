package fundamentals;
import java.util.Scanner;
public class PowerOfNumber {
    
    public static void main(String[] args) {
        // Write your code here
         Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          int x=s.nextInt();
          int p=1;
          for(int i=1;i<=x;i++)
          {
               p=p*n;
          }
          System.out.println(p);
        
    }
}
