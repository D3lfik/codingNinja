package arrayintro;
public class SecondLargest {  
 public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        if (arr.length<=1)
        {
            //System.out.println("Array size <= 1");
            return second;
        }
        else
        {
            boolean check=true;
            for (int i=1;i<arr.length;i++)
            {
                if (arr[0]!=arr[i])
                {
                    check=false;
                    break;
                    //count++;
                }
            }
            
            if (check==true)
            {
                //System.out.println("All elements are equal");
                return second;
            }
            else
            {
                for (int i=0;i<arr.length;i++)
                {
                    if (arr[i]>first)
                    {
                        second=first;
                        first=arr[i];
                    }
                    else if (arr[i]>second && arr[i] != first)
                    {
                        second=arr[i];
                    }}}}
		return second;}}
            