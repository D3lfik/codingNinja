package Strings;

public class Count {
	public static int countWords(String str){

        int count=0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i) == ' ')
            {
                count++;
            }
        }
        
        //System.out.println(count+1);
        return (count+1);

	}
}
