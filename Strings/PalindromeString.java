package Strings;
public class PalindromeString {
	public static String isPalindrome(String str) {
	   String check="";
        for (int i=0;i<str.length();i++)
        {
            check=str.charAt(i)+check;
        }
        
        return (check.equals(str));

	}
	public static void main(String[] args) {
	   String	check="abcdcba";
	   String ispali=isPalindrome(check);
	   
		
	}
}

