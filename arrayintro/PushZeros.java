package arrayintro;

public class PushZeros {
	 public static void pushZerosAtEnd(int[] arr) {
	    	//Your code goes here
	        int count=0,sumarr=0;
	        for (int i=0;i<arr.length;i++)
	        {
	            if (arr[i]!=0)
	            {
	                arr[count++]=arr[i];
	            }
	        }
	        
	        while (count<arr.length)
	        {
	            arr[count]=0;
	            count++;
	        }
	        
	        }
	    }

