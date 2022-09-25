package Functions;
import java.util.Scanner;
public class MaximumNumber {
	public static int maxNum(int num) {
        int max = 0;
        for (int i = 1; i < num; i *= 10) {
            max = Math.max(max, num % i + num / (i * 10) * i);
        }
        return max;
    }
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	int max=maxNum(num);
	System.out.println(max);
}

}
