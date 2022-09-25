package Timecomplexity;

public class ArrayEquilibriumIndex {
public static int arrayEquilibriumIndex(int[] arr) {
	int rightSum=0, leftSum=0;
	for (int i=0;i<arr.length;i++) {
		rightSum += arr[i];
		
	}
	for (int i=0;i<arr.length;i++) {
		rightSum -= arr[i];
		if (leftSum==rightSum) {
			return i;
		}
		leftSum +=arr[i];
	}
	return -1;
}
}
