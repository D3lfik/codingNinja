package arrayintro;
public class Sort012 {

    public static void sort012(int[] arr){
    	//Your code goes here
        int zero=0, one=0, two=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==0)
            {
                zero++;
            }
            else if (arr[i]==1)
            {
                one++;
            }
            else
            {
                two++;
            }
        }
        
        int i=0;
        while (zero>0)
        {
            arr[i]=0;
            zero--;
            i++;
        }
        
        while (one>0)
        {
            arr[i]=1;
            one--;
            i++;
        }
        while (two>0)
        {
            arr[i]=2;
            two--;
            i++;
        }
    }

}