package Timecomplexity;
import java.util.*;
public class ArrayIntersection {
	public static void arrayIntersection(int [] arr1, int[]arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		merge(arr1,arr2);
	}
	private static void merge(int arr1[],int arr2[]) {
		int i=0,j=0;
		while (i<arr1.length && j<arr2.length) {
			if (arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
				
			}else if (arr1[i]<arr2[j]) {
				i++;
			}else {
				j++;
			}
		}
		
	}
	
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int n=s.nextInt();
    	int m=s.nextInt();
    	int []arr1= new int [n];
    	int []arr2= new int [m];
    	arrayIntersection(arr1,arr2);
    	
		
	

    }}
