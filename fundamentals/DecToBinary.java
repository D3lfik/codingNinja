package fundamentals;
import java.io.*;
import java.util.*;
public class DecToBinary {//fucntion to convert decimal to binary
	static void decToBinary(int n) {
		int[]binaryNum = new int[1000];//array to store binary number 
		int i =0;//counter for binary array
		while (n>0) {//storing remainder in binary array
			binaryNum[i]=n%2;
			n = n/2;
			i++;
		
		}
		for (int j=i-1;j>=0;j--) //printing binary array in reverse order 
			System.out.print(binaryNum[j]);
	}
public static void main(String[] args) { //driver program
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	if (n==0)
    {
        System.out.print("0");
        return;
    }
	//System.out.println("Decimal-"+n);
	//System.out.print( );
	decToBinary(n);
}
}
