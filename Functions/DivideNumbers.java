package Functions;

public class DivideNumbers {
public static int divideNumbers(int num,int deno) {
	if (deno==0) {
		return Integer.MIN_VALUE;
		}
		//System.out.println("Inside divison fucntion ");
		return num/deno;
	}
public static void printDivisionResult(int num,int deno) {
	if (deno==0) {
		System.out.println("Divison by zero is not allowed");
		return;
	}
	System.out.println(num/deno);
}
public static void main(String[] args) {
	int num=8;
	int deno=0;
	printDivisionResult(num,deno);
	int result=divideNumbers(num,deno);
	if (result>0) {
		
	}else {
}
	System.out.println(result);
	
}
}
