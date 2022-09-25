package fundamentals;

import java.util.Scanner;
public class PalindromeNumber {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n , revNum = 0;
        while ( temp>0){
            int lastDigit = temp%10;
            temp=temp%10;
            revNum=revNum*10+lastDigit;
            
        }
        if (n==revNum)
            System.out.println("True");
        else 
            System.out.println("False");


        }

	}