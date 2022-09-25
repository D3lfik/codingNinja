package arrayintro;
public class RotateArray {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here        
        int[] temp=new int[d];
        for (int i=0;i<d;i++)
        {
            temp[i]=arr[i];
            //System.out.print (temp[i] + " ");
        }
        //System.out.println();
        for (int i=0,j=0;i<arr.length && j<d;i++)
        {
            if (i<arr.length-d)
            {
                arr[i]=arr[i+d];
            }
            else
            {
                arr[i]=temp[j];
                j++;
            }
        }
    }

}