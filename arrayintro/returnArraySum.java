package arrayintro;

public class returnArraySum {
	public static int sum(int[] arr) {
        int sum=0;
        for (int element:
             arr) {
            sum+=element;
        }
        return sum;
	}
}
